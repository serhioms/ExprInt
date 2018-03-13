# Expression interpretator

Evaluate expressions with Number, Boolean and Sets algebra with String and Bit operations. Operational order controlled by brackets ().

### What is special?

Interpretator developed based on [ANTLR gramma](https://github.com/serhioms/ExprInt/blob/master/gramma/CalcSet.g4), [ANTLR visitor](https://github.com/serhioms/ExprInt/blob/master/src/main/java/org/exprint/antlr/EvalVisitor.java) and [five type implementation](https://github.com/serhioms/ExprInt/tree/master/src/main/java/org/exprint/type). That is all!

I like ANTLR!

Special thanks to [Shmatov](https://github.com/shmatov/antlr4-calculator) and [mgrzeszczak](https://github.com/mgrzeszczak/set-calculator) for god examples of how to ANTLR.

Boolean and Sets algebra following wiki below)
    [Boolean algebra](https://en.wikipedia.org/wiki/Boolean_algebra)
    [De Morgan laws](https://en.wikipedia.org/wiki/De_Morgan%27s_laws)
    [Set math](https://en.wikipedia.org/wiki/Set_(mathematics))
    [Set symmetric difference](https://en.wikipedia.org/wiki/Symmetric_difference)
    [Complement set](https://en.wikipedia.org/wiki/Complement_(set_theory))

### Number expressions
Available operations with real and integer numbers are +, -, *, /, ^ (power), == (equals), >=, >, <=, <.
There 2 predefined real constants _pi (3.14) and  _e (2.71)

Examples here:
    [Simple arifmetika from Shmatov example](https://github.com/serhioms/ExprInt/blob/master/data/arifmetika.txt)

