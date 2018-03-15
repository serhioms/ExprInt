# Expression interpretator

Evaluate expressions with Real numbers, Integers, Booleans, Strings and Sets. Able to declare variables by expression assignment. Set can contain any type include other sets.

## Usage

### Download project and start run.cmd from command line.
C:\ExprInt>run.cmd<br/>
Enter expression, help or quit...<br/>
\>2+2<br/>
4

### Java 8 required as below

C:\ExprInt>java -version<br/>
java version "1.8.0_161"<br/>
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)<br/>
Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)<br/>

## What is special?

Interpretator developed based on [ANTLR gramma](https://github.com/serhioms/ExprInt/blob/master/gramma/CalcSet.g4), [ANTLR visitor](https://github.com/serhioms/ExprInt/blob/master/src/main/java/org/exprint/antlr/EvalVisitor.java) and [implementation of each of 5 types ](https://github.com/serhioms/ExprInt/tree/master/src/main/java/org/exprint/type).

Is not it clean and straight forward? I like ANTLR!

Special thanks to [Shmatov](https://github.com/shmatov/antlr4-calculator) and [Mgrzeszczak](https://github.com/mgrzeszczak/set-calculator) for good examples of how to do ANTLR for numbers and simple sets.

Boolean and sets algebra following wiki below: [Boolean algebra](https://en.wikipedia.org/wiki/Boolean_algebra), [De Morgan laws](https://en.wikipedia.org/wiki/De_Morgan%27s_laws), [Set math](https://en.wikipedia.org/wiki/Set_(mathematics)), [Set symmetric difference](https://en.wikipedia.org/wiki/Symmetric_difference), [Complement set](https://en.wikipedia.org/wiki/Complement_(set_theory)), [Bit operations](https://www.programiz.com/java-programming/bitwise-operators). 

## What is not covered

- Interpretator gramma does not implement functions(args);
- There are couple set operations are not implemented - cartesian product and powerset.

## Boolean expressions
Available operations are >=, >, <=, <, == (equals), != or <> (not equal), && (or), || (and), -> (implication), !& (nand), !| (nor), X| (xor), X! (xnor). There are two predefined boolean constants true and false.

Examples here: [basic](https://github.com/serhioms/ExprInt/blob/master/data/booleanbasic.txt), [boolean laws](https://github.com/serhioms/ExprInt/blob/master/data/booleanlaw.txt), [the morgan laws](https://github.com/serhioms/ExprInt/blob/master/data/booleanmorgan.txt)

## Number expressions
Available operations with real and integer numbers are +, -, *, /, ** (power), ==, >=, >, <=, <.<br/>

There are two predefined real constants _pi (3.14) and  _e (2.71).

Here are examples: [arifmetika follows Shmatov example](https://github.com/serhioms/ExprInt/blob/master/data/numarifmetika.txt), [set var follows Shmatov example](https://github.com/serhioms/ExprInt/blob/master/data/setvar.txt)

### Bit operations with integer
There are couple of [bit operations](https://www.programiz.com/java-programming/bitwise-operators) available for integers as ~ (inversion), >> (right shift), >>> (unsigned right shift), << (left shift), & (and), | (or), ^^(xor). Here is [bit example](https://github.com/serhioms/ExprInt/blob/master/data/bit.txt).

## String expressions
"This is a string constant in double quotation marks"

Available operations with strings are # (length), + (concatenation), ==, !=. Here is [string example](https://github.com/serhioms/ExprInt/blob/master/data/string.txt).

## Sets expressions
Available operations are # (cardinality), == (equals), @ (belongs), & (intersection), && (recursive intersection), | (union), \ (complements), /\ (disjunctive union), ' (complement set), ! (not empty).<br/>

There couple special sets are {} (empty set), _u (universal set).

Here are examples: [initialization](https://github.com/serhioms/ExprInt/blob/master/data/setsimple.txt), [basic](https://github.com/serhioms/ExprInt/blob/master/data/setbasic.txt), [cardinality](https://github.com/serhioms/ExprInt/blob/master/data/setcardinality.txt), [union](https://github.com/serhioms/ExprInt/blob/master/data/setunion.txt), [union laws](https://github.com/serhioms/ExprInt/blob/master/data/setunionlaw.txt), [intersection](https://github.com/serhioms/ExprInt/blob/master/data/setintersection.txt), [intersection laws](https://github.com/serhioms/ExprInt/blob/master/data/setintersectionlaw.txt), [complements](https://github.com/serhioms/ExprInt/blob/master/data/setcomplements.txt), [complements laws](https://github.com/serhioms/ExprInt/blob/master/data/setcomplementslaw.txt), [empty set laws](https://github.com/serhioms/ExprInt/blob/master/data/setemptylaw.txt), [membership](https://github.com/serhioms/ExprInt/blob/master/data/setmembershipbasic.txt), [subset laws](https://github.com/serhioms/ExprInt/blob/master/data/subsetlaw.txt), [universal set](https://github.com/serhioms/ExprInt/blob/master/data/setuniversalbasic.txt), [relative laws](https://github.com/serhioms/ExprInt/blob/master/data/setrelativelaw.txt), [symmetric difference](https://github.com/serhioms/ExprInt/blob/master/data/setsymmetricdifferencelaw.txt),  [complex set](https://github.com/serhioms/ExprInt/blob/master/data/setcomplex.txt)

### [ExprInt Test Suit](https://github.com/serhioms/ExprInt/blob/master/src/test/java/test/ExprintTest.java)