package org.exprint.util;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import javautilstream.MyCollectors;

public class UtilSet {

	public static <S> Set<S> emptySet(Set<?> set) {
		if( set instanceof TreeSet ) {
	        return unorderedSet();
		} else if( set instanceof LinkedHashSet ) {
	        return orderedSet();
	    } else {
	    	throw new RuntimeException(String.format("Expected TreeSet or LinkedHashSet but not %s!", set.getClass().getSimpleName()));
	    }
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <S> Set<S> unorderedSet(Set<?> ...data ) {
		Set set = new TreeSet(); // TreeSet sort unordered pair ({1,2}=={2,1}), HashSet - sometime does not 
		for(Set<?> ini: data) {
			set.addAll(ini);
		}
		return set;
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <S> Set<S> orderedSet(Set<?> ...data ) {
		Set set = new LinkedHashSet(); // LinkedHashSet keep ordered pair ({1,2}!={2,1}), HashSet - not ({1,2}=={2,1}). 
		for(Set<?> ini: data) {
			set.addAll(ini);
		}
		return set;
    }

    /*
     * {3,4,{5,6,{8,9}}} & {3,5,{6,7,{8,9}}} = {3}
     */
	static public <T> Set<T> intersectionOf(Set<T> a, Set<T> b) {
		return a.parallelStream().filter(b::contains).collect(MyCollectors.toTreeSet());
	}

	static public <T> Set<T> unionOf(Set<T> a, Set<?> b) {
		return Stream.concat(a.stream(), b.parallelStream()).collect(MyCollectors.collectingAndThen(MyCollectors.toTreeSet(), UtilSet::unorderedSet));	
	}

	static public <T> Set<T> complementsOf(Set<T> a, Set<?> b) {
		return a.parallelStream().filter(aa -> !b.contains(aa)).collect(MyCollectors.toTreeSet());
	}
}
