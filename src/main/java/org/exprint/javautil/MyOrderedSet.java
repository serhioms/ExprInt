package org.exprint.javautil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyOrderedSet<E> extends MySetNotImplemented<E> implements Set<E> {

	protected List<E> list = new ArrayList<E>();
	//protected List<E> list = Collections.synchronizedList(new ArrayList<E>());
	//protected List<E> list = new java.util.concurrent.CopyOnWriteArrayList<E>();
	
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public synchronized Iterator<E> iterator() {
		return list.iterator();
	}

	@Override
	public boolean add(E e) {
		return list.add(e);
	}

	@Override
	public synchronized String toString() {
		return "[" + list.stream().map(Object::toString).collect(Collectors.joining(","))+"]";
	}
}
 
