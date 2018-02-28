package org.exprint.type;

import java.util.Set;

public class AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	public static final String UNEXPECTED_TYPE = "Unexpected type: ";
	public static final String NOT_IMPLEMENTED = "Not implemented";

	@Override
	public int compareTo(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Boolean getBoolean() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public String getString() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Integer getInteger() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Double getDouble() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public Set<?> getSet() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType sum(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType substruction(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType multiplication(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType division(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType power(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType changeSign() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType equal(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType notequal(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType or(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType and(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType not() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType implication(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType concatenation(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType union(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType intersection(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType subset(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType powerset() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType cartesian(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType cardinality() {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}

	@Override
	public AtomicType complements(AtomicType o) {
		throw new RuntimeException(NOT_IMPLEMENTED);
	}
}
