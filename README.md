# Expression interpretator

Evaluate expressions with Number, Boolean and Sets algebra with String and Bit operations. Able to declare variables by assignment of one of expression of 5 types: Real, Integer, Boolean, String and Set. Set can contains all 5 types.

## Usage

### Download project and start run.cmd from command line.
C:\ExprInt>run.cmd
Enter expression, help or quit...
>2+2<br/>
4

### Java8 must be available as below

C:\ExprInt>java -version
java version "1.8.0_161"
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)

## What is special?

Interpretator developed based on [ANTLR gramma](https://github.com/serhioms/ExprInt/blob/master/gramma/CalcSet.g4), [ANTLR visitor](https://github.com/serhioms/ExprInt/blob/master/src/main/java/org/exprint/antlr/EvalVisitor.java) and [implementation of five types ](https://github.com/serhioms/ExprInt/tree/master/src/main/java/org/exprint/type).

Is not it clean and straight forward? I like ANTLR!

Special thanks to [Shmatov](https://github.com/shmatov/antlr4-calculator) and [Mgrzeszczak](https://github.com/mgrzeszczak/set-calculator) for good examples of how to do ANTLR for numbers and simple sets.

Boolean and Sets algebra following wiki below: [Boolean algebra](https://en.wikipedia.org/wiki/Boolean_algebra), [De Morgan laws](https://en.wikipedia.org/wiki/De_Morgan%27s_laws), [Set math](https://en.wikipedia.org/wiki/Set_(mathematics)), [Set symmetric difference](https://en.wikipedia.org/wiki/Symmetric_difference), [Complement set](https://en.wikipedia.org/wiki/Complement_(set_theory)).

### Number expressions
Available operations with real and integer numbers are +, -, *, /, ^ (power), == (equals), >=, >, <=, <.
There are two predefined real constants _pi (3.14) and  _e (2.71).

Examples here: [arifmetika follows Shmatov example](https://github.com/serhioms/ExprInt/blob/master/data/numarifmetika.txt), [set var follows Shmatov example](https://github.com/serhioms/ExprInt/blob/master/data/setvar.txt)



