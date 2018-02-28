package org.exprint.type;

public class StringType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private String val;

	public StringType(String text) {
		this.val = text.replaceAll("\"", "");
	}
	
	public StringType(Integer val) {
		this.val = val.toString();
	}

	@Override
	public String toString() {
		return val;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof StringType) {
			return val.equals(((StringType)obj).val);
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
			return val.compareTo(((StringType)obj).val);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}

	@Override
	public Double getDouble() {
		return Double.parseDouble(val);
	}
	
	@Override
	public Boolean getBoolean() {
		return Boolean.parseBoolean(val);
	}

	@Override
	public Integer getInteger() {
		return Integer.parseInt(val);
	}

	@Override
	public String getString() {
		return val;
	}

	
	@Override
	public AtomicType concatenation(AtomicType o) {
		return new StringType( val + o.getString());
	}

	@Override
	public AtomicType equal(AtomicType o) {
		return new BooleanType( val.equalsIgnoreCase(o.getString()));
	}
	
	@Override
	public AtomicType notequal(AtomicType o) {
		return new BooleanType( !val.equalsIgnoreCase(o.getString()));
	}

	@Override
	public AtomicType sum(AtomicType o) {
		return concatenation(o);
	}
}
