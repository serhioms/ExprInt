package org.exprint;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.exprint.type.IntegerType;
import org.exprint.type.MathType;

public class MathSet<T> {

    public final Set<T> data;

    private MathSet(Set<T> data) {
        this.data = data;
    }

    public static <S> MathSet<S> ofSet(Set<S> set) {
        return new MathSet<>(set);
    }

	@SuppressWarnings("unchecked")
	public static <S> MathSet<S> ofArr(Object... list) {
		@SuppressWarnings("rawtypes")
		HashSet set = new HashSet<>();
    	for(Object o: list){
    		set.add(o);
    	}
        return new MathSet<>(set);
    }

    public MathSet<T> union(MathSet<T> other) {
        return Stream.concat(data.stream(), other.data.stream()).collect(Collectors.collectingAndThen(Collectors.toSet(), MathSet::ofSet));
    }

    public MathSet<T> intersection(MathSet<T> other) {
        return MathSet.ofSet(data.stream().filter(other.data::contains).collect(Collectors.toSet()));
    }

    public MathSet<T> difference(MathSet<T> other) {
        return MathSet.ofSet(data.stream().filter(i -> !other.data.contains(i)).collect(Collectors.toSet()));
    }

    @Override
    public String toString() {
        return "{" + data.stream().map(Object::toString).collect(Collectors.joining(",")) + "}";
    }
    
	public MathSet<T> plus(MathSet<T> other) {
		return MathSet.ofArr(new IntegerType("3"));
	}

	public MathSet<MathType> minus(MathSet<MathType> visit) {
		return null;
	}

	public MathSet<MathType> mult(MathSet<MathType> visit) {
		return null;
	}

	public MathSet<MathType> div(MathSet<MathType> visit) {
		return null;
	}

	public MathSet<MathType> pow(MathSet<MathType> visit) {
		//Math.pow(this, visit);
		return null;
	}

	public MathSet<MathType> changeSign() {
		// -1*this
		return null;
	}
}
