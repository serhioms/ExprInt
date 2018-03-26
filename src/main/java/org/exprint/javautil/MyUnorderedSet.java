package org.exprint.javautil;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class MyUnorderedSet<E extends Comparable<? super E>> extends MyOrderedSet<E> {

	private boolean isSorted = false;
	
	@Override
	public boolean add(E e) {
		if( super.contains(e) ) {
			return false;
		} else {
			isSorted = false;
			return super.add(e);
		}
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean isAdd = false;
		for(E e: c) {
			isAdd |= add(e);
		}
		return isAdd;
	}

	@Override
	public synchronized String toString() {
		if( !isSorted ) {
			isSorted = true;
			Collections.sort(super.list);
		}
		return "{" + super.stream().map(Object::toString).collect(Collectors.joining(","))+"}";
	}
}
