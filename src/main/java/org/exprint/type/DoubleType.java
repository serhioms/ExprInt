package org.exprint.type;

public class DoubleType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	public static final double MIN_DIFFERENCE = 0.000000001;

	private Double val;

	public DoubleType(String text) {
		this.val = Double.parseDouble(text);
	}

	public DoubleType(Double val) {
		this.val = new Double(val);
	}

	@Override
	public String toString() {
		return val.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof IntegerType) {
			return val.equals(((DoubleType)obj).val);
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
			return val.compareTo(((DoubleType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public Integer getInteger() {
		return val.intValue();
	}

	@Override
	public Double getDouble() {
		return val;
	}

	@Override
	public String getString() {
		return val.toString();
	}

	@Override
	public AtomicType sum(AtomicType a) {
		return new DoubleType(val + a.getDouble());
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		return new DoubleType(val - a.getDouble());
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		return new DoubleType(val * a.getDouble());
	}

	@Override
	public AtomicType division(AtomicType a) {
		return new DoubleType(val / a.getDouble());
	}

	@Override
	public AtomicType power(AtomicType o) {
		return new DoubleType(Math.pow(val, o.getDouble()));
	}

	@Override
	public AtomicType changeSign() {
		return new DoubleType(val * -1.0);
	}

	@Override
	public AtomicType equal(AtomicType o) {
		return new BooleanType( Math.abs(val - o.getDouble()) <= MIN_DIFFERENCE);
	}

	@Override
	public AtomicType notequal(AtomicType o) {
		return new BooleanType( Math.abs(val - o.getDouble()) > 0.000000001);
	}
	
}
