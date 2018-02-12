package org.exprint.type;

public class IntegerType implements MathType, Comparable<MathType> {

	private static final String UNEXPECTED_TYPE = "Unexpected type: ";
	
	private Integer val;

	public IntegerType(String text) {
		this.val = Integer.parseInt(text);
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
	public int compareTo(MathType obj) {
		if( obj instanceof IntegerType) {
			return val.compareTo(((IntegerType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public void sum(MathType a) {
		val += a.getInteger();
	}

	@Override
	public void sub(MathType a) {
		val -= a.getInteger();
	}

	@Override
	public void mul(MathType a) {
		val *= a.getInteger();
	}

	@Override
	public void div(MathType a) {
		val /= a.getInteger();
	}

	@Override
	public Integer getInteger() {
		return val;
	}

	@Override
	public Double getDouble() {
		return val.doubleValue();
	}
	
	
}
