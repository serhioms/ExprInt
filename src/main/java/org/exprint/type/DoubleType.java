package org.exprint.type;

public class DoubleType implements MathType, Comparable<MathType> {

	private static final String UNEXPECTED_TYPE = "Unexpected type: ";
	
	private Double val;

	public DoubleType(String text) {
		this.val = Double.parseDouble(text);
	}

	public DoubleType(double val) {
		this.val = val;
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
	public int compareTo(MathType obj) {
		if( obj instanceof IntegerType) {
			return val.compareTo(((DoubleType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public void sum(MathType a) {
		val += a.getDouble();
	}

	@Override
	public void sub(MathType a) {
		val -= a.getDouble();
	}

	@Override
	public void mul(MathType a) {
		val *= a.getDouble();
	}

	@Override
	public void div(MathType a) {
		val /= a.getDouble();
	}

	@Override
	public Integer getInteger() {
		return val.intValue();
	}

	@Override
	public Double getDouble() {
		return val;
	}
	
	
}
