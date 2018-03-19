package org.exprint.type;

import static org.exprint.util.UtilSet.complementsOf;
import static org.exprint.util.UtilSet.intersectionOf;
import static org.exprint.util.UtilSet.unionOf;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.exprint.util.UtilSet;

public class SetType<T extends AtomicType> extends AtomicNotImplemented implements AtomicType, Comparable<AtomicType> {

	private Set<T> set;
	private Set<T> complementarySet;

    private SetType() {
    	this(null, null);
    }

    private SetType(Set<T> set, Set<T> complementarySet) {
        this.set = set;
        this.complementarySet = complementarySet;
    }

	public static SetType<AtomicType> unorderedEmptySet() {
        return new SetType<AtomicType>(UtilSet.unorderedSet(), null);
    }

	public static SetType<AtomicType> orderedEmptySet() {
        return new SetType<AtomicType>(UtilSet.orderedSet(), null);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static <S extends AtomicType> SetType<S> normalSet(Set<?> set) {
        return new SetType(set, null);
    }

	public static <S extends AtomicType> SetType<S> universalSet() {
        return new SetType<>(null, null);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <S extends AtomicType> SetType<S> complementarySet(Set<?> set) {
        return new SetType(null, set);
    }

    @Override
	public AtomicType cloneInstance() {
		return new SetType<>(deepClone(set), deepClone(complementarySet));
	}

	private Set<AtomicType> deepClone(Set<T> s) {
		if( s == null ) {
			return null;
		} else {
			Set<AtomicType> newset = UtilSet.emptySet(s);
			for(T a: s) {
				newset.add(a.cloneInstance());
			}
			return newset;
		}
	}

	@Override
    public String toString() {
		if( set == null && complementarySet == null) {
	    	return "_u";
	    }
		
		String result = "";
		if( set instanceof TreeSet ) {
			result += "{" + set.stream().map(AtomicType::toMyString).collect(Collectors.joining(","))+"}";
		}
		if( set instanceof LinkedHashSet ) {
			result += "[" + set.stream().map(AtomicType::toMyString).collect(Collectors.joining(","))+"]"; 
	    } 
		
		if( set != null && complementarySet != null) {
			result += "*";
	    }

		if( complementarySet instanceof TreeSet ) {
	    	result += "{" + complementarySet.stream().map(AtomicType::toMyString).collect(Collectors.joining(",")) + "}'";
		} 
		if( complementarySet instanceof LinkedHashSet ) {
			result += "[" + complementarySet.stream().map(AtomicType::toMyString).collect(Collectors.joining(",")) + "]'";
	    }
		return result;
	}

	@Override
	public boolean equals(Object o) {
		return this.toString().replaceAll("\\[", "{").replaceAll("\\]", "}").equals(o.toString().replaceAll("\\[", "{").replaceAll("\\]", "}"));
	}
	
	@Override
	public int compareTo(AtomicType a) {
		return this.toString().replaceAll("\\[", "{").replaceAll("\\]", "}").compareTo(a.toString().replaceAll("\\[", "{").replaceAll("\\]", "}"));
	}
	
	@Override
	public int hashCode() {
		return set!=null? set.hashCode(): complementarySet!=null? complementarySet.hashCode(): 0;
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
	public Set<T> getComplementarySet() {
		return complementarySet;
	}

	@Override
	public boolean isNormalSet() {
		return set != null && complementarySet == null;
	}

	@Override
	public boolean isComplimentarySet() {
		return set == null && complementarySet != null;
	}

	@Override
	public boolean isUniversalSet() {
		return set == null && complementarySet == null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public AtomicType union(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
		        return normalSet(unionOf(set, a.getSet())); 										// A | B 
			} else if( isUniversalSet() || a.isUniversalSet() ) {
				return universalSet();																// A | U = U; A' | U = U; U | U = U 
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {
				return complementarySet(intersectionOf(complementarySet, (Set<T>)a.getComplementarySet())); // A' | B' = U \ (A & B);  A' | A' = A' 
			} else if( a.isComplimentarySet() ) {
				return complementarySet(complementsOf(a.getComplementarySet(), set));				// A | B' = (B \ A)'; A | A' = (A \ A)' = U 
			} else if( isComplimentarySet() ) {
				return complementarySet(complementsOf(complementarySet, a.getSet()));				// A' | B = (A \ B)'; A' | A = (A \ A)' = U 
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "|", a));
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "|", a));
	}

	@SuppressWarnings("unchecked")
	@Override
	public AtomicType intersection(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
		        return normalSet(intersectionOf(set, (Set<T>)a.getSet()));									// normal A & B 
			} else if( isUniversalSet() && a.isUniversalSet() ) {
				return universalSet();																// U & U = U 
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {
				return complementarySet(unionOf(complementarySet, a.getComplementarySet()));		// A' & B' = U \ (A | B); A' & A' = A' 
			} else if( isUniversalSet() ) {
				return a.cloneInstance();															// U & A = A; U & A' = A'	
			} else if( a.isUniversalSet() ) {
				return cloneInstance();																// A & U = A; A' & U = A'	
			} else if( a.isComplimentarySet() ) {
				return normalSet(complementsOf(set, a.getComplementarySet()));						// A & B' = A \ B; A & A' = {} 
			} else if( isComplimentarySet() ) {
				return normalSet(complementsOf(complementarySet, a.getSet()));						// A' & B = B \ A; A' & A = {} 
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "&", a), e);
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "&", a));
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public AtomicType and(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
				return normalSet(recursiveIntersectionOf(set, (Set<T>)a.getSet()));			// normal A & B
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "&&", a), e);
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "&&", a));
	}

	@SuppressWarnings("unchecked")
	@Override
	public AtomicType complements(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
				return normalSet(complementsOf(set, a.getSet()));									// A \ B
			} else if( isUniversalSet() && a.isUniversalSet() ) {
				return unorderedEmptySet();															// U - U = {} 		
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {
				return normalSet(complementsOf(a.getComplementarySet(), complementarySet));			// A' - B' = B \ A; A' - A' = {}
			} else if( isUniversalSet() ) {
				if( a.isComplimentarySet() ) {														// U \ A' = A; U \ {} = U
					return a.getComplementarySet().isEmpty()? universalSet(): normalSet(a.cloneInstance().getComplementarySet());
				} else if( a.isNormalSet() ) {
					return complementarySet(a.cloneInstance().getSet());							// U \ A = A'; U \ {} = U
				}
			} else if( a.isUniversalSet() ) {
				return unorderedEmptySet();																	// A \ U = {}; A' & U = {}; {} \ U = U 		
			} else if( a.isComplimentarySet() ) {
		        return normalSet(intersectionOf(set, (Set<T>)a.getComplementarySet()));				// A \ A' = A; A \ B' = A & B 
			} else if( isComplimentarySet() ) {
				return complementarySet(unionOf(complementarySet, a.getSet()));						// A'\ A = A'; A'\ B = (A | B)' 
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "\\", a),e);
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "\\", a));
	}

	
	@Override
	public AtomicType complementSet() {
		try {
			if( isNormalSet() ) {																	// !A = U \ A = A'; U \ {} = U
				return complementarySet(cloneInstance().getSet());
			} else if( isComplimentarySet() ) {														// !A' = U \ A' = A; U \ {} = U
				return getComplementarySet().isEmpty()? universalSet(): normalSet(cloneInstance().getComplementarySet());
			} else if( isUniversalSet() ) {															// !U = U \ U = {}
				return unorderedEmptySet();
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "!", this), e);
		}
		throw new RuntimeException(String.format(NOT_VALID2, "!", this));
	}
	
	@Override
	public AtomicType disjunctiveUnion(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
				return complements(a).union(a.complements(this));
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {
				return normalSet(unionOf(complementsOf(complementarySet,a.getComplementarySet()), complementsOf(a.getComplementarySet(),complementarySet)));
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "/\\", a), e);
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "/\\", a));
	}

	@SuppressWarnings("unchecked")
	@Override
	public AtomicType subset(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {
				return new BooleanType(complementsOf(set, a.getSet()).isEmpty());					// A @ B : true/false
			} else if( a.isUniversalSet() ) {
				return new BooleanType(true);														// A @ U, A' @ U, U @ U: true
			} else if( isUniversalSet() ) {
				return new BooleanType(!(a.isNormalSet() && !a.getComplementarySet().isEmpty()));	// U @ A: false, U @ A': false, U @ {}': true
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {
				return new BooleanType(complementsOf(a.getComplementarySet(), complementarySet).isEmpty()); // A' @ A': true, A' @ B': true/false
			} else if( a.isComplimentarySet() ) {
				return new BooleanType(intersectionOf(set, (Set<T>)a.getComplementarySet()).isEmpty());		// A @ A': false, A @ B': true/false
			} else if( isComplimentarySet() ) {
				// TODO: Not sure about  A' @ B: false
				return new BooleanType(false);														// A' @ A: false, A' @ B: false
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "@", a), e);
		}
		throw new RuntimeException(String.format(NOT_VALID3, this, "@", a));
	}

	@Override
	public AtomicType not() {
		try {
			if( isNormalSet() ) {
				return new BooleanType(set == null || set.isEmpty());
			} else {
				return new BooleanType(false);
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "!", this), e);
		}
	}
	
	@Override
	public Boolean getBoolean() {
		try {
			if( isNormalSet() ) {
				return !set.isEmpty();
			} else {
				return true;
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "getBoolean", this), e);
		}
	}
	
	@Override
	public AtomicType cardinality() {
		try {
			if( isNormalSet() ) {
				return new IntegerType(set.size());
			} else if( isUniversalSet() ) {
				return new IntegerType(Integer.MAX_VALUE);
			} else if( isComplimentarySet() ) {
				return new IntegerType(Integer.MAX_VALUE - complementarySet.size());
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR3, getMessage(e), "#", this), e);
		}
		throw new RuntimeException(String.format(NOT_VALID2, "#", this));
	}

	@SuppressWarnings("unchecked")
	@Override
	public AtomicType multiplication(AtomicType a) {
		try {
			if( isNormalSet() && a.isNormalSet() ) {									// A * B
				return normalSet(cartesianOf(set, (Set<T>)a.getSet()));	
			} else if( isComplimentarySet() && a.isComplimentarySet() ) {				// A' * B'
				return complementarySet(cartesianOf(complementarySet, (Set<T>)a.getComplementarySet()));
			} else if( isComplimentarySet() && a.isSet() ) {							// A' * B
				return normalSet(complementaryCartesianOf(this, (Set<T>)a.getSet()));	
			} else if( isSet() && a.isComplimentarySet() ) {							// A * B'
				return normalSet(complementaryCartesianOf(set, a));	
			}
		} catch( Exception e) {
			throw new RuntimeException(String.format(RUNTIME_ERROR4, getMessage(e), this, "*", a), e);
		}
		throw new RuntimeException(String.format(NOT_IMPLEMENTED4, "Cartesian", this, "*", a));
	}

	public Collection<? extends T> addAll(Set<T> s) {
		set.addAll(s);
		return set;
	}

	@Override
	public boolean isSet() {
		return true;
	}
	
	
	/*
	 * {3,4,{5,6,{8,9}}} & {3,5,{6,7,{8,9}}} = {3,{6,{8,9}}} 
	 */
	@SuppressWarnings("unchecked")
	private static <T extends AtomicType> Set<T> recursiveIntersectionOf(Set<T> a, Set<T> b) {
		Set<T> ab = intersectionOf(a, b);

		Set<T> anext = nextLevel(a);
		Set<T> bnext = nextLevel(b);
		
		if( anext.isEmpty() || bnext.isEmpty() ) {
			return null;
		}
		
		for (AtomicType aa : anext) {
			for (AtomicType bb: bnext) {
				Set<T> result = recursiveIntersectionOf((Set<T>)aa.getSet(), (Set<T>)bb.getSet());
				if( result != null ) {
					((Set<AtomicType>)ab).add(normalSet(result));
				}
			}
		}
		
		return ab;
	}
	
	private static <T extends AtomicType> Set<T> nextLevel(Set<T> set) {
		return set.parallelStream().filter(s -> s.isSet()).collect(Collectors.toSet());
	}

	@SuppressWarnings("unchecked")
	private static <T extends AtomicType> Set<T> cartesianOf(Set<T> a, Set<T> b) {
		Set<AtomicType> r = UtilSet.unorderedSet();
		for (AtomicType aa : a) {
			for (AtomicType bb: b) {
				if( aa instanceof SetType && bb instanceof SetType) {
					r.add(normalSet(cartesianOf((Set<T>)aa.getSet(), (Set<T>)bb.getSet())));
				} else if(  aa instanceof SetType ){
					r.add(aa.cloneInstance());
					r.add(normalSet(toOrderedSet(bb.cloneInstance())));
				} else if(  bb instanceof SetType ){
					r.add(bb.cloneInstance());
					r.add(normalSet(toOrderedSet(aa.cloneInstance())));
				} else {
					r.add(normalSet(toOrderedSet(aa.cloneInstance(), bb.cloneInstance())));
				}
			}
		}
		return (Set<T>)r;
	}

	@SuppressWarnings("unchecked")
	private Set<T> complementaryCartesianOf(Set<T> a, AtomicType b) {
		Set<AtomicType> r = UtilSet.unorderedSet();
		for (AtomicType aa : a) {
			r.add(normalSet(toOrderedSet(aa.cloneInstance(), complementarySet(b.cloneInstance().getComplementarySet()))));
		}
		return (Set<T>)r;
	}

	@SuppressWarnings("unchecked")
	private Set<T> complementaryCartesianOf(SetType<T> a, Set<T> b) {
		Set<AtomicType> r = UtilSet.unorderedSet();
		for (AtomicType bb : b) {
			r.add(normalSet(toOrderedSet(complementarySet(a.cloneInstance().getComplementarySet()), bb.cloneInstance())));
		}
		return (Set<T>)r;
	}


	@SuppressWarnings("unchecked")
	private static <T extends AtomicType> Set<T> toOrderedSet(AtomicType... arr) {
		Set<AtomicType> set = UtilSet.orderedSet();
		for(AtomicType a: arr) {
			set.add(a);
		}
		return (Set<T>)set;
	}
	
	public void add(T a) {
		if( set != null ) {
			set.add(a);
		} else if( complementarySet != null ) {
			complementarySet.add(a);
		} else {
			throw new RuntimeException("Can't add element to "+toString());
		}
	}
}
