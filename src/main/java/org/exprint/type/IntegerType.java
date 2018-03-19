package org.exprint.type;

public class IntegerType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Integer val;

	public IntegerType(String val) {
		try {
			this.val = Integer.parseInt(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "IntegerType", val));
		}
	}
	
	public IntegerType(Integer val) {
		try {
			this.val = new Integer(val.intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "IntegerType", val));
		}
	}

	@Override
	public AtomicType cloneInstance() {
		try {
			return new IntegerType(val.intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "cloneInstance", this));
		}
	}

	@Override
	public String toString() {
		try {
			return val.toString();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "toString", this));
		}
	}

	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public int compareTo(AtomicType a) {
		if( a instanceof IntegerType ) {
			return val.compareTo(a.getInteger());
		} else {
			return super.compareTo(a);
		}
	}

	@Override
	public Double getDouble() {
		try {
			return val.doubleValue();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getDouble", this));
		}
	}

	@Override
	public String getString() {
		try {
			return val.toString();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getString", this));
		}
	}
	
	@Override
	public Integer getInteger() {
		try {
			return val;
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getInteger", this));
		}
	}

	@Override
	public Boolean getBoolean() {
		try {
			return new Boolean( val <= 0? false: val >= 1? true: true);  
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getInteger", this));
		}
	}

	@Override
	public AtomicType sum(AtomicType a) {
		try {
			return new IntegerType( val + a.getInteger());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "+", a));
		}
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		try {
			return new IntegerType( val - a.getInteger());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "-", a));
		}
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		try {
			return new IntegerType( val * a.getInteger());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "*", a));
		}
	}

	@Override
	public AtomicType division(AtomicType a) {
		try {
			return new IntegerType( val / a.getInteger());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "/", a));
		}
	}

	@Override
	public AtomicType power(AtomicType a) {
		try {
			return new IntegerType(new Double(Math.pow(val, a.getDouble())).intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "**", this));
		}
	}

	@Override
	public AtomicType changeSign() {
		try {
			return new IntegerType( val * -1);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "-", this));
		}
	}

	@Override
	public AtomicType bitRightUnsigned(AtomicType a) {
		try {
			return new IntegerType(val.intValue() >>> a.getInteger().intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, ">>>", a));
		}
	}

	@Override
	public AtomicType bitLeft(AtomicType a) {
		try {
			return new IntegerType(val.intValue() << a.getInteger().intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "<<<", a));
		}
	}

	@Override
	public AtomicType bitRight(AtomicType a) {
		try {
			return new IntegerType(val.intValue() >> a.getInteger().intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, ">>", a));
		}
	}

	@Override
	public AtomicType bitInvers() {
		try {
			return new IntegerType(~val.intValue());
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "!", this));
		}
	}

	@Override
	public AtomicType intersection(AtomicType a) {
		try {
			return new IntegerType(val.intValue() & a.getInteger().intValue());
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "&", a));
		}
	}

	@Override
	public AtomicType union(AtomicType a) {
		try {
			return new IntegerType(val.intValue() | a.getInteger().intValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "|", a));
		}
	}

	@Override
	public AtomicType bitXor(AtomicType a) {
		try {
			return new IntegerType(val.intValue() ^ a.getInteger().intValue());
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "^^", a));
		}
	}

	@Override
	public AtomicType cardinality() {
		return new IntegerType(Integer.MAX_VALUE);
	}
}
