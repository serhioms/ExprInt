package org.exprint.type;

public interface MathType {

	public Integer getInteger();
	public Double getDouble();

	public void sum(MathType a);
	public void sub(MathType a);
	public void mul(MathType a);
	public void div(MathType a);
	
	static MathType parseInt(String text) {
		return new IntegerType(text);
	}

	static MathType parseDouble(String text) {
		return new DoubleType(text);
	}

	static MathType parseDouble(double val) {
		return new DoubleType(val);
	}
}
