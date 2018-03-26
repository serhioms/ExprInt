package org.exprint.javautil;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySetNotImplemented<E> implements Set<E> {

	private static final String NOT_IMPLEMENTED = "NotImplemented";

	@Override
	public int size() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean contains(Object o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Object[] toArray() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean add(E e) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean remove(Object o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public void clear() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}
}
 
