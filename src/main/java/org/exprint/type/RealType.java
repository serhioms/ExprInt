package org.exprint.type;

public class RealType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	public static final double MIN_DIFFERENCE = 0.000000000000001D;

	private Double val;

	public RealType(String val) {
		try {
			this.val = Double.parseDouble(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "RealType", val));
		}
	}

	public RealType(Double val) {
		try {
			this.val = new Double(val.doubleValue());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "RealType", val));
		}
	}

	@Override
	public AtomicType cloneInstance() {
		try {
			return new RealType(val);
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
		if( a instanceof RealType ) {
			return val.compareTo(a.getDouble());
		} else {
			return super.compareTo(a);
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
			return new RealType(val + a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "+", a));
		}
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		try {
			return new RealType(val - a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "-", a));
		}
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		try {
			return new RealType(val * a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "*", a));
		}
	}

	@Override
	public AtomicType division(AtomicType a) {
		try {
			return new RealType(val / a.getDouble());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "/", a));
		}
	}

	@Override
	public AtomicType power(AtomicType o) {
		try {
			return new RealType(Math.pow(val, o.getDouble()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "**", this));
		}
	}

	@Override
	public AtomicType changeSign() {
		try {
			return new RealType(val * -1.0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "-", this));
		}
	}


	@Override
	public AtomicType cardinality() {
		return new RealType(Double.MAX_VALUE);
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
}
