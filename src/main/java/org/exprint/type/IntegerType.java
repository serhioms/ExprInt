package org.exprint.type;

public class IntegerType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Integer val;

	public IntegerType(String text) {
		this.val = Integer.parseInt(text);
	}
	
	public IntegerType(Integer val) {
		this.val = new Integer(val.intValue());
	}

	@Override
	public String toString() {
		return val.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof IntegerType) {
			return val.equals(((IntegerType)obj).val);
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
			return val.compareTo(((IntegerType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public Double getDouble() {
		return val.doubleValue();
	}

	@Override
	public String getString() {
		return val.toString();
	}
	
	@Override
	public Integer getInteger() {
		return val;
	}

	@Override
	public AtomicType sum(AtomicType a) {
		return new IntegerType( val + a.getInteger());
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		return new IntegerType( val - a.getInteger());
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		return new IntegerType( val * a.getInteger());
	}

	@Override
	public AtomicType division(AtomicType a) {
		return new IntegerType( val / a.getInteger());
	}

	@Override
	public AtomicType power(AtomicType o) {
		return new IntegerType(new Double(Math.pow(val, o.getDouble())).intValue());
	}

	@Override
	public AtomicType changeSign() {
		return new IntegerType( val * -1);
	}

	@Override
	public AtomicType equal(AtomicType o) {
		return new BooleanType( val.equals(o.getInteger()));
	}

	@Override
	public AtomicType notequal(AtomicType o) {
		return new BooleanType( !val.equals(o.getInteger()));
	}
}
