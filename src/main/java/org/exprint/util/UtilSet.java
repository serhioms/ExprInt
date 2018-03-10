package org.exprint.util;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.exprint.type.AtomicType;
import org.exprint.type.SetType;

public class UtilSet {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static <S> Set<S> ofSet(Set<?> data) {
        return new HashSet(data);
    }

    /*
     * {3,4,{5,6,{8,9}}} & {3,5,{6,7,{8,9}}} = {3}
     */
	static public <T> Set<T> intersectionOf(Set<T> a, Set<T> b) {
		return a.parallelStream().filter(b::contains).collect(Collectors.toSet());
	}

	/*
	 * {3,4,{5,6,{8,9}}} & {3,5,{6,7,{8,9}}} = {3,{6,{8,9}}} 
	 */
	@SuppressWarnings("unchecked")
	static public <T extends AtomicType> Set<T> recursiveIntersectionOf(Set<T> a, Set<T> b) {
		Set<T> ab = intersectionOf(a, b);

		Set<T> anext = nextLevel(a);
		Set<T> bnext = nextLevel(b);
		
		if( anext.isEmpty() || bnext.isEmpty() ) {
			return null;
		}
		
		for (AtomicType aa : anext) {
			for (AtomicType bb: bnext) {
				Set<T> result = recursiveIntersectionOf((Set<T>)aa.getSet(), (Set<T>)bb.getSet());
				if( result != null ) {
					((Set<AtomicType>)ab).add(SetType.normalSet(result));
				}
			}
		}
		
		return ab;
	}

	private static <T extends AtomicType> Set<T> nextLevel(Set<T> set) {
		return set.parallelStream().filter(s -> s.isSet()).collect(Collectors.toSet());
	}

	static public <T> Set<T> unionOf(Set<T> a, Set<?> b) {
		return Stream.concat(a.stream(), b.parallelStream()).collect(Collectors.collectingAndThen(Collectors.toSet(), UtilSet::ofSet));	
	}

	static public <T> Set<T> complementsOf(Set<T> a, Set<?> b) {
		return a.parallelStream().filter(i -> !b.contains(i)).collect(Collectors.toSet());
	}
}
