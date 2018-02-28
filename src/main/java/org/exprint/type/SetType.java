package org.exprint.type;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetType<T> extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Set<T> set;

    private SetType(Set<T> val) {
        this.set = val;
    }

    public static <S> SetType<S> ofSet(Set<S> set) {
        return new SetType<>(set);
    }

    @Override
    public String toString() {
        return "{" + set.stream().map(Object::toString).collect(Collectors.joining(",")) + "}";
    }
    
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof SetType) {
			return set.equals(((SetType<?>)obj).set);
		} else {
			throw new RuntimeException(UNEXPECTED_TYPE+obj.getClass().getName());
		}
	}
	
	@Override
	public int hashCode() {
		return set.hashCode();
	}

	@Override
	public String getString() {
		return toString();
	}
	
	@Override
	public Set<T> getSet() {
		return set;
	}

	@Override
	public AtomicType union(AtomicType o) {
        return Stream.concat(set.stream(), o.getSet().stream()).collect(Collectors.collectingAndThen(Collectors.toSet(), SetType::ofSet));
	}

	@Override
	public AtomicType substruction(AtomicType o) {
        return SetType.ofSet(set.stream().filter(i -> !o.getSet().contains(i)).collect(Collectors.toSet()));
	}

	@Override
	public AtomicType intersection(AtomicType o) {
        return SetType.ofSet(set.stream().filter(o.getSet()::contains).collect(Collectors.toSet()));
	}

	@Override
	public AtomicType subset(AtomicType o) {
		return new BooleanType(set.stream().filter(i -> !o.getSet().contains(i)).collect(Collectors.toSet()).isEmpty());
	}

	@Override
	public AtomicType equal(AtomicType o) {
		return new BooleanType(toString().equals(o.toString()));
	}

	@Override
	public AtomicType notequal(AtomicType o) {
		return new BooleanType(!toString().equals(o.toString()));
	}

	@Override
	public AtomicType not() {
		return  new BooleanType(set.isEmpty());
	}

	@Override
	public Boolean getBoolean() {
		return !set.isEmpty();
	}

	@Override
	public AtomicType cardinality() {
		return new IntegerType(set.size());
	}

	@Override
	public AtomicType cartesian(AtomicType o) {
		// TODO Auto-generated method stub
		return super.cartesian(o);
	}

	@Override
	public AtomicType powerset() {
		// TODO Auto-generated method stub
		return super.powerset();
	}


	
	@Override
	public AtomicType multiplication(AtomicType o) {
		return cartesian(o);
	}

	@Override
	public AtomicType or(AtomicType o) {
		return union(o);
	}

	@Override
	public AtomicType and(AtomicType o) {
		return intersection(o);
	}

	@Override
	public AtomicType sum(AtomicType o) {
		return union(o);
	}
}
