package org.exprint.type;

public class StringType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private String val;

	public StringType(String val) {
		try {
			this.val = val.replaceAll("\"", "");
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "StringType", val));
		}
	}
	
	public StringType(Integer val) {
		try {
			this.val = val.toString();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "StringType", val));
		}
	}

	@Override
	public AtomicType cloneInstance() {
		try {
			return new StringType(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "cloneInstance", val));
		}
	}

	@Override
	public String toString() {
		try {
			return val;
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "toString", this));
		}
	}

	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public Double getDouble() {
		try {
			return Double.parseDouble(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getDouble", this));
		}
	}
	
	@Override
	public Boolean getBoolean() {
		try {
			return Boolean.parseBoolean(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getBoolean", this));
		}
	}

	@Override
	public Integer getInteger() {
		try {
			return Integer.parseInt(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getInteger", this));
		}
	}

	@Override
	public String getString() {
		return val;
	}

	
	@Override
	public AtomicType concatenation(AtomicType a) {
		try {
			return new StringType( val + a.getString());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "+", a));
		}
	}

	@Override
	public AtomicType equal(AtomicType a) {
		try {
			return new BooleanType( val.equalsIgnoreCase(a.getString()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "==", a));
		}
	}
	
	@Override
	public AtomicType notequal(AtomicType a) {
		try {
			return new BooleanType( !val.equalsIgnoreCase(a.getString()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "!=", a));
		}
	}

	@Override
	public AtomicType cardinality() {
		return new IntegerType(val.length());
	}
	
	@Override
	public AtomicType sum(AtomicType a) {
		return concatenation(a);
	}

}