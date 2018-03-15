package org.exprint.type;

import java.util.Set;

abstract public class AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	public static final String UNEXPECTED_TYPE = "Unexpected type: ";
	public static final String UNEXPECTED_OPERATION = "Unexpected operation: ";
	public static final String NOT_IMPLEMENTED3 = "%s%s%s is not valid!";
	public static final String NOT_IMPLEMENTED2 = "%s%s is not valid!";
	public static final String NOT_IMPLEMENTED1 = "%s is not valid for %s!";
	public static final String RUNTIME_ERROR4 = "%s: (%s) %s (%s)";
	public static final String RUNTIME_ERROR3 = "%s: %s(%s)";

	@Override
	public int compareTo(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "compareTo", a.getClass().getSimpleName()));
	}
	

	@Override
	public Boolean getBoolean() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getBoolean", this.getClass().getSimpleName()));
	}

	@Override
	public String getString() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getString", this.getClass().getSimpleName()));
	}

	@Override
	public Integer getInteger() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getInteger", this.getClass().getSimpleName()));
	}

	@Override
	public Double getDouble() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getDouble", this.getClass().getSimpleName()));
	}

	@Override
	public Set<? extends AtomicType> getSet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getSet", this.getClass().getSimpleName()));
	}

	@Override
	public AtomicType sum(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "+", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType substruction(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "-", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType multiplication(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "*", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType division(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "/", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType power(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "^", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType changeSign() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED2, "-", this.getClass().getSimpleName()));
	}

	@Override
	public AtomicType or(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "||", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType xor(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "X|", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType nand(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "!|", a.getClass().getSimpleName()));
	}


	@Override
	public AtomicType xnor(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "X!", a.getClass().getSimpleName()));
	}


	@Override
	public AtomicType nor(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "!|", a.getClass().getSimpleName()));
	}


	@Override
	public AtomicType and(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "&&", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType not() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED2, "!", this.getClass().getSimpleName()));
	}
	
	@Override
	public AtomicType complementSet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED2, this.getClass().getSimpleName(), "'"));
	}


	@Override
	public AtomicType implication(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "->", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType concatenation(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "+", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType union(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "|", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType intersection(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "&", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType powerset() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, "~", this.getClass().getSimpleName()));
	}

	@Override
	public AtomicType cartesian(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "*", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType cardinality() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED2, "#", this.getClass().getSimpleName()));
	}

	@Override
	public AtomicType complements(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "\\", a.getClass().getSimpleName()));
	}

	@Override
	public Set<? extends AtomicType> getComplementarySet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "getComplimentarySet", this.getClass().getSimpleName()));
	}

	@Override
	public boolean isComplimentarySet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "isComplimentarySet", this.getClass().getSimpleName()));
	}

	@Override
	public boolean isUniversalSet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "isUniversalSet", this.getClass().getSimpleName()));
	}

	@Override
	public boolean isNormalSet() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED1, "isNormalSet", this.getClass().getSimpleName()));
	}

	@Override
	public AtomicType disjunctiveUnion(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "\\|", a.getClass().getSimpleName()));
	}
	
	protected String getMessage(Exception e) {
		return e.getMessage() != null? e.getMessage(): e.getClass().getSimpleName();
	}

	@Override
	public AtomicType bitXor(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "^^", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType bitRightUnsigned(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), ">>>", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType bitLeft(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), "<<", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType bitRight(AtomicType a) {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this.getClass().getSimpleName(), ">>", a.getClass().getSimpleName()));
	}

	@Override
	public AtomicType bitInvers() {
		throw new RuntimeException(String.format(NOT_IMPLEMENTED2, "~", this.getClass().getSimpleName()));
	}

	@Override
	public boolean isSet() {
		return false;
	}

	@Override
	public AtomicType subset(AtomicType a) {
		try {
			if( a instanceof SetType ) {
				for (AtomicType b : a.getSet()) {
					if( b.equals(this) ) {
						return new BooleanType(true);
					}
				}
				return new BooleanType(false);
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "@", a));
		}
		throw new RuntimeException(String.format(NOT_IMPLEMENTED3, this, "@", a));
	}
	
	
	@Override
	public AtomicType equal(AtomicType a) {
		try {
			return new BooleanType(this.equals(a));
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "==", a));
		}
	}

	@Override
	public AtomicType notequal(AtomicType a) {
		try {
			return new BooleanType(!this.equals(a));
		} catch(Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "!=", a));
		}
	}

	
	
	
	@Override
	public AtomicType less(AtomicType a) {
		try {
			return new BooleanType( this.compareTo(a) < 0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "<", a));
		}
	}

	@Override
	public AtomicType greater(AtomicType a) {
		try {
			return new BooleanType( this.compareTo(a) > 0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, ">", a));
		}
	}

	@Override
	public AtomicType lessEqual(AtomicType a) {
		try {
			return new BooleanType( this.compareTo(a) <= 0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "<=", a));
		}
	}

	@Override
	public AtomicType greaterEqual(AtomicType a) {
		try {
			return new BooleanType( this.compareTo(a) >= 0);
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, ">=", a));
		}
	}
}
