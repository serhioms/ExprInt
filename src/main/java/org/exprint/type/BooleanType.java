package org.exprint.type;

public class BooleanType extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Boolean val;

	public BooleanType(String val) {
		try {
			this.val = Boolean.parseBoolean(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "BooleanType", val));
		}
	}
	
	public BooleanType(Boolean val) {
		this.val = new Boolean(val);
	}

	
	@Override
	public AtomicType cloneInstance() {
		try {
			return new BooleanType(val);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "BooleanType", val));
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
	public int compareTo(AtomicType a) {
		if( a instanceof BooleanType ) {
			return val.compareTo(a.getBoolean());
		} else {
			return super.compareTo(a);
		}
	}
	
	@Override
	public int hashCode() {
		return val.hashCode();
	}

	@Override
	public Boolean getBoolean() {
		return val;
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
	public AtomicType implication(AtomicType a) {
		try {
			return new BooleanType( !val || a.getBoolean());
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "->", a));
		}
	}

	@Override
	public AtomicType or(AtomicType a) {
		try {
			return new BooleanType(val || a.getBoolean());
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "||", a));
		}
	}

	@Override
	public AtomicType and(AtomicType a) {
		try {
			return new BooleanType(val && a.getBoolean());
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "&&", a));
		}
	}

	@Override
	public AtomicType not() {
		try {
			return new BooleanType(!val);
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "!", this));
		}
	}

	@Override
	public AtomicType xor(AtomicType a) {
		try {
			return new BooleanType((val && !a.getBoolean())||(!val && a.getBoolean()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "X|", a));
		}
	}

	@Override
	public AtomicType nand(AtomicType a) {
		try {
			return new BooleanType(!(val && a.getBoolean()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "!&", a));
		}
	}

	@Override
	public AtomicType xnor(AtomicType a) {
		try {
			return new BooleanType((val && a.getBoolean())||(!val && !a.getBoolean()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "x|", a));
		}
	}

	@Override
	public AtomicType nor(AtomicType a) {
		try {
			return new BooleanType(!(val|| a.getBoolean()));
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "!|", a));
		}
	}

	@Override
	public AtomicType cardinality() {
		return new IntegerType(1);
	}
}
