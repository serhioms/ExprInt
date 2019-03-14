package org.exprint.util;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.exprint.javautil.MyCollectors;
import org.exprint.javautil.MyOrderedSet;
import org.exprint.javautil.MyUnorderedSet;

public class UtilSet {

	public static <S> Set<S> emptySet(Set<?> set) {
		if( set instanceof MyUnorderedSet ) {
	        return unorderedSet();
		} else if( set instanceof MyOrderedSet ) {
	        return orderedSet();
	    } else {
	    	throw new RuntimeException(String.format("Expected MyUnorderedSet or MyOrderedSet but not %s!", set.getClass().getSimpleName()));
	    }
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <S> Set<S> unorderedSet(Set<?> ...data ) {
		Set set = new MyUnorderedSet(); // Tree Set sort unordered pair ({1,2}=={2,1}), HashSet - sometime does not 
		for(Set<?> ini: data) {
			set.addAll(ini);
		}
		return set;
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <S> Set<S> orderedSet(Set<?> ...arr ) {
		Set set = new MyOrderedSet(); // Linked Hash Set keep ordered pair ({1,2}!={2,1}), HashSet - not ({1,2}=={2,1}). 
		for(Set<?> s: arr) {
			for(Object o: s) {
				set.add(o);
			}
		}
		return set;
    }

    /*
     * {3,4,{5,6,{8,9}}} & {3,5,{6,7,{8,9}}} = {3}
     */
	static public <T> Set<T> intersectionOf(Set<T> a, Set<T> b) {
		if( a instanceof MyOrderedSet ) {
			return orderedIntersectionOf(a, b);
		} else if( a instanceof MyUnorderedSet ) {
			return unorderedIntersectionOf(a, b);
		} else {
	    	throw new RuntimeException(String.format("Expected MyUnorderedSet or MyOrderedSet but not %s!", a.getClass().getSimpleName()));
		}
	}
	
	static private <T> Set<T> unorderedIntersectionOf(Set<T> a, Set<T> b) {
		String str;
		if( (str=b.toString()).contains("*")) {
			str = str.replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}").replaceAll("\\[", "\\\\[").replaceAll("\\]", "\\\\]").replaceAll("\\*", "(.*?)");
			final Pattern pattern = Pattern.compile(str);
			Set<T> result = unorderedSet();
			a.stream().forEach(ai -> {
				if( pattern.matcher(ai.toString()).matches() ) {
					result.add(ai);
				}
			});
			return result;
		} else {
			return a.parallelStream().filter(b::contains).collect(MyCollectors.toMyUnorderedSet());
		}
	}

	static private <T> Set<T> orderedIntersectionOf(Set<T> a, Set<T> b) {
		String str;
		if( (str=b.toString()).contains("*")) {
			str = str.replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}").replaceAll("\\[", "\\\\[").replaceAll("\\]", "\\\\]").replaceAll("\\*", "(.*?)");
			final Pattern pattern = Pattern.compile(str);
			Set<T> result = orderedSet();
			a.stream().forEach(ai -> {
				if( pattern.matcher(ai.toString()).matches() ) {
					result.add(ai);
				}
			});
			return result;
		} else {
			return a.parallelStream().filter(b::contains).collect(MyCollectors.toMyOrderedSet());
		}
	}

	static public <T> Set<T> unionOf(Set<T> a, Set<?> b) {
		if( a instanceof MyOrderedSet ) {
			return orderedUnionOf(a, b);
		} else if( a instanceof MyUnorderedSet ) {
			return unorderedUnionOf(a, b);
		} else {
	    	throw new RuntimeException(String.format("Expected MyUnorderedSet or MyOrderedSet but not %s!", a.getClass().getSimpleName()));
		}
	}

	static private <T> Set<T> unorderedUnionOf(Set<T> a, Set<?> b) {
		return Stream.concat(a.parallelStream(), b.parallelStream()).collect(MyCollectors.collectingAndThen(MyCollectors.toMyUnorderedSet(), UtilSet::unorderedSet));	
	}

	static private <T> Set<T> orderedUnionOf(Set<T> a, Set<?> b) {
		return Stream.concat(a.stream(), b.stream()).collect(MyCollectors.collectingAndThen(MyCollectors.toMyUnorderedSet(), UtilSet::orderedSet));	
	}

	static public <T> Set<T> complementsOf(Set<T> a, Set<?> b) {
		if( a instanceof MyOrderedSet ) {
			return orderedComplementsOf(a, b);
		} else if( a instanceof MyUnorderedSet ) {
			return unorderedComplementsOf(a, b);
		} else {
	    	throw new RuntimeException(String.format("Expected MyUnorderedSet or MyOrderedSet but not %s!", a.getClass().getSimpleName()));
		}
	}
	
	static private <T> Set<T> unorderedComplementsOf(Set<T> a, Set<?> b) {
		return a.parallelStream().filter(aa -> !b.contains(aa)).collect(MyCollectors.toMyUnorderedSet());
	}

	static private <T> Set<T> orderedComplementsOf(Set<T> a, Set<?> b) {
		return a.stream().filter(aa -> !b.contains(aa)).collect(MyCollectors.toMyOrderedSet());
	}
}
