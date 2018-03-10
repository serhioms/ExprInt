package org.exprint.type;

public class DoubleType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	public static final double MIN_DIFFERENCE = 0.000000001;

	private Double val;

	public DoubleType(String val) {
		try {
			this.val = Double.parseDouble(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "DoubleType", val));
		}
	}

	public DoubleType(Double val) {
		try {
			this.val = new Double(val.doubleValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "DoubleType", val));
		}
	}

	@Override
	public AtomicType cloneInstance() {
		try {
			return new DoubleType(val);
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
	public boolean equals(Object obj) {
		if( obj instanceof DoubleType) {
			return val.equals(((DoubleType)obj).val);
		} else if( obj instanceof Double) {
			return val.equals((Double)obj);
		} else {
			//throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
			return false;
		}
	}

	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public int compareTo(AtomicType a) {
		try {
			return val.compareTo(a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "compareTo", a));
		}
	}

	@Override
	public Integer getInteger() {
		try {
			return val.intValue();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getInteger", this));
		}
	}

	@Override
	public Double getDouble() {
		return val;
	}

	@Override
	public String getString() {
		try {
			return val.toString();
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getInteger", this));
		}
	}

	@Override
	public AtomicType sum(AtomicType a) {
		try {
			return new DoubleType(val + a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "+", a));
		}
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		try {
			return new DoubleType(val - a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "-", a));
		}
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		try {
			return new DoubleType(val * a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "*", a));
		}
	}

	@Override
	public AtomicType division(AtomicType a) {
		try {
			return new DoubleType(val / a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "/", a));
		}
	}

	@Override
	public AtomicType power(AtomicType o) {
		try {
			return new DoubleType(Math.pow(val, o.getDouble()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "^", this));
		}
	}

	@Override
	public AtomicType changeSign() {
		try {
			return new DoubleType(val * -1.0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "-", this));
		}
	}

	
	
	@Override
	public AtomicType equal(AtomicType a) {
		try {
			return new BooleanType( Math.abs(val - a.getDouble()) <= MIN_DIFFERENCE);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "==", a));
		}
	}

	@Override
	public AtomicType notequal(AtomicType a) {
		try {
			return new BooleanType( Math.abs(val - a.getDouble()) > MIN_DIFFERENCE);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "!=", a));
		}
	}


	@Override
	public AtomicType cardinality() {
		return new DoubleType(Double.MAX_VALUE);
	}
}
