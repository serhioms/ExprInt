# Expression interpretator

Evaluate expressions with Number, Boolean and Sets algebra with String and Bit operations. Operational order controlled by brackets ().

### What is special?

Interpratator developed based on ANTLR gramma
https://github.com/serhioms/ExprInt/blob/master/gramma/CalcSet.g4 
plus ANTLR visitor implementation https://github.com/serhioms/ExprInt/blob/master/src/main/java/org/exprint/antlr/EvalVisitor.java
plus five type implementations https://github.com/serhioms/ExprInt/tree/master/src/main/java/org/exprint/type.

Boolean and Sets algebra following wiki below
    https://en.wikipedia.org/wiki/Boolean_algebra
    https://en.wikipedia.org/wiki/De_Morgan%27s_laws
    https://en.wikipedia.org/wiki/Set_(mathematics)
    https://en.wikipedia.org/wiki/Symmetric_difference
    https://en.wikipedia.org/wiki/Complement_(set_theory)

### Number expressions
Available operations with real and integer numbers are +, -, *, /, ^ (power), == (equals), >=, >, <=, <.
There 2 predefined real constants _pi (3.14) and  _e (2.71)

Examples here:
    https://github.com/serhioms/ExprInt/blob/master/data/arifmetika.txt

![alt text](https://github.com/serhioms/MultiTest/blob/master/result/MultiTest%20diagram.png)



