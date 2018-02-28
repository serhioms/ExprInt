package org.exprint.type;

import java.util.Set;

public interface AtomicType {

	public Integer getInteger();
	public Double getDouble();
	public AtomicType sum(AtomicType o);
	public AtomicType substruction(AtomicType o);
	public AtomicType multiplication(AtomicType o);
	public AtomicType division(AtomicType o);
	public AtomicType power(AtomicType o);
	public AtomicType changeSign();

	public String getString();
	public AtomicType concatenation(AtomicType o);

	public Set<?> getSet();
	public AtomicType union(AtomicType o);
	public AtomicType intersection(AtomicType o);
	public AtomicType complements(AtomicType o);
	public AtomicType subset(AtomicType o);
	public AtomicType cartesian(AtomicType o);
	public AtomicType powerset();
	public AtomicType cardinality();
	
	public Boolean getBoolean();
	public AtomicType implication(AtomicType o);
	public AtomicType equal(AtomicType o);
	public AtomicType notequal(AtomicType visit);
	public AtomicType or(AtomicType o);
	public AtomicType and(AtomicType o);
	public AtomicType not();
}
