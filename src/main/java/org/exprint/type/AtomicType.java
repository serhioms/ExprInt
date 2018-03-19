package org.exprint.type;

import java.util.Set;

public interface AtomicType {

	public AtomicType cloneInstance();

	public Integer getInteger();
	public Double getDouble();
	
	public AtomicType sum(AtomicType a);
	public AtomicType substruction(AtomicType a);
	public AtomicType multiplication(AtomicType a);
	public AtomicType division(AtomicType a);
	public AtomicType power(AtomicType a);
	public AtomicType changeSign();
	
	public AtomicType bitXor(AtomicType a);
	public AtomicType bitRightUnsigned(AtomicType a);
	public AtomicType bitLeft(AtomicType a);
	public AtomicType bitRight(AtomicType a);
	public AtomicType bitInvers();

	public String getString();
	public AtomicType concatenation(AtomicType a);

	public Set<? extends AtomicType> getSet();
	public Set<? extends AtomicType> getComplementarySet();
	
	public boolean isSet();
	public boolean isNormalSet();
	public boolean isUniversalSet();
	public boolean isComplimentarySet();
	
	public AtomicType union(AtomicType a);
	public AtomicType intersection(AtomicType a);
	public AtomicType complements(AtomicType a);
	public AtomicType subset(AtomicType a);
	public AtomicType cardinality();
	public AtomicType disjunctiveUnion(AtomicType a);
	public AtomicType complementSet();
	
	public Boolean getBoolean();
	
	public AtomicType implication(AtomicType a);
	public AtomicType or(AtomicType a);
	public AtomicType and(AtomicType a);
	public AtomicType not();
	public AtomicType xor(AtomicType a);
	public AtomicType nand(AtomicType a);
	public AtomicType xnor(AtomicType a);
	public AtomicType nor(AtomicType a);

	public AtomicType equal(AtomicType a);
	public AtomicType notequal(AtomicType a);
	public AtomicType less(AtomicType a);
	public AtomicType greater(AtomicType a);
	public AtomicType lessEqual(AtomicType a);
	public AtomicType greaterEqual(AtomicType a);

	default public String toMyString() {return this instanceof StringType? "\""+this.toString()+"\"": this.toString();}
}
