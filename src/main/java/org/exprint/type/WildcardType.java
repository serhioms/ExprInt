package org.exprint.type;

public class WildcardType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	static public final WildcardType instance = new WildcardType();
	
	private WildcardType() {
	}
	
	@Override
	public AtomicType cloneInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "*";
	}

	@Override
	public int hashCode() {
		return "*".hashCode();
	}

	@Override
	public int compareTo(AtomicType a) {
		return 0;
	}

	@Override
	public String getString() {
		return "*";
	}
}
