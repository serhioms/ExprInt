package org.exprint.type;

public class BooleanType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Boolean val;

	public BooleanType(String text) {
		this.val = Boolean.parseBoolean(text);
	}
	
	public BooleanType(Boolean val) {
		this.val = new Boolean(val);
	}
	
	@Override
	public String toString() {
		return val.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof StringType) {
			return val.equals(((BooleanType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public int compareTo(AtomicType obj) {
		if( obj instanceof IntegerType) {
			return val.compareTo(((BooleanType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public Boolean getBoolean() {
		return val;
	}

	@Override
	public String getString() {
		return val.toString();
	}

	@Override
	public AtomicType or(AtomicType other) {
		return new BooleanType(val || other.getBoolean());
	}

	@Override
	public AtomicType and(AtomicType other) {
		return new BooleanType(val && other.getBoolean());
	}

	@Override
	public AtomicType equal(AtomicType o) {
		return new BooleanType(val == o.getBoolean());
	}

	@Override
	public AtomicType notequal(AtomicType o) {
		return new BooleanType(val != o.getBoolean());
	}

	@Override
	public AtomicType implication(AtomicType o) {
		return new BooleanType( !val || o.getBoolean());
	}

	@Override
	public AtomicType not() {
		return new BooleanType(!val);
	}
}
