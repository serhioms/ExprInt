grammar CalcSet;
/*
	Expression lexems https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation
*/
WS				: [ \t\r]+ -> skip;
NL				: '\n';
INT				: [0-9]+;
DOUBLE			: [0-9]+'.'[0-9]+;
MATH_PI			: '_pi';
MATH_E			: '_e';
TRUE			: 'true';
FALSE			: 'false';
ID				: [a-zA-Z_][a-zA-Z_0-9]*;
STRING			: '"' ~( '\r' | '\n' | '"' )* '"';

/*
	Number algebra
*/
ASSIGN		: '=';
PLUS		: '+';
MINUS		: '-';
MULT		: '*';
DIV			: '/';
POW			: '**';

/*
	Bit operations https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
*/
BIT_INVERS		: '~';
BIT_XOR			: '^';
BIT_LEFT		: '<<';
BIT_RIGHT		: '>>';
BIT_RIGHTU		: '>>>';

/*
	Boolean and number algebra
*/
GR			: '>';
GRE			: '>=';
LS			: '<';
LSE			: '<=';
EQUAL		: '==';
NEQUAL		: '!=';
AND			: '&&';
OR			: '||';
NOT			: '!';

/*
	Boolean algebra
*/
IMPLICATION	: '->';

/*
	More boolean and number https://en.wikipedia.org/wiki/Boolean_algebra
*/
NAND		: '!&';
NOR			: '!|';
XOR			: 'X|';
XNOR		: 'X!';

/* 
	Sets https://en.wikipedia.org/wiki/Set_(mathematics)
 */
INTERSECTION		: '&';
UNION				: '|';
COMPLEMENTS			: '\\';
SUBSET				: '@';
COMPLEMENT_SET		: '\'';   /* https://en.wikipedia.org/wiki/Complement_(set_theory) */
DISJUNCTIVE_UNION	: '/\\';  /* https://en.wikipedia.org/wiki/Symmetric_difference */

/*
	Input string - expression
*/
input
	: setVar NL input					# ToSetVar 
	| booleanOp NL						# Calculate
	;

setVar
	: ID ASSIGN booleanOp				# SetVariable
	;

booleanOp 
    : booleanOp OR equalNotequal  		# Or
    | booleanOp XOR equalNotequal  		# Xor
    | booleanOp NOR equalNotequal  		# Nor
    | booleanOp XNOR equalNotequal  	# Xnor
    | booleanOp AND equalNotequal		# And
    | booleanOp NAND equalNotequal		# Nand
    | equalNotequal                  	# ToEqualNotequal
    ;

equalNotequal
    : equalNotequal EQUAL plusOrMinus 	# Equal
    | equalNotequal NEQUAL plusOrMinus	# Nequal
    | equalNotequal GR plusOrMinus		# Greater
    | equalNotequal GRE plusOrMinus		# GreaterEqual
    | equalNotequal LS plusOrMinus		# Less
    | equalNotequal LSE plusOrMinus		# LessEqual
    | plusOrMinus						# ToPlusOrMinus
	;
	
plusOrMinus 
    : plusOrMinus PLUS implicationSubset  					# Plus
    | plusOrMinus MINUS implicationSubset					# Minus
    | implicationSubset                  					# ToImplicationSubset
    ;

implicationSubset
    : implicationSubset IMPLICATION union					# ImplicationSet
    | implicationSubset SUBSET union						# SubSet
    | union													# ToUnion
    ;

union
    : union UNION intersectionComplements  					# UnionSet
    | union DISJUNCTIVE_UNION intersectionComplements  		# DisjunctiveUnion
    | intersectionComplements								# ToIntersectionComplements
    ;

intersectionComplements
    : intersectionComplements INTERSECTION multOrDiv		# IntersectionSet
    | intersectionComplements COMPLEMENTS multOrDiv			# ComplementsSet
    | multOrDiv												# ToMultOrDiv
    ;

multOrDiv
    : multOrDiv MULT bit				# Multiplication
    | multOrDiv DIV bit					# Division
    | bit								# ToBit
    ;

bit
    : bit BIT_LEFT pow					# BitLeft
    | bit BIT_RIGHT pow					# BitRight
    | bit BIT_RIGHTU pow				# BitRightUnsigned
    | bit BIT_XOR pow					# BitXor
    | pow								# ToPow
    ;

pow
    : unaryMinus (POW pow)? 			# Power
    ;

unaryMinus
    : MINUS unaryMinus 					# ChangeSign
    | NOT unaryMinus					# UnaryNot
    | unaryMinus COMPLEMENT_SET			# ComplementSet
    | BIT_INVERS unaryMinus				# BitInvers
    | atom             					# ToAtom
    ;

atom
    : ID					# Variable
    | MATH_PI				# ConstantPI
    | MATH_E				# ConstantE
    | STRING				# String
    | TRUE					# Boolean
    | FALSE					# Boolean
    | DOUBLE				# Double
    | INT					# Int
    | '(' booleanOp ')'		# Braces
    | '|' booleanOp '|'		# AtomCardinality /* https://en.wikipedia.org/wiki/Cardinal_number#Cardinal_arithmetic */
    | expr					# ToExprFrAtom
	;

/*
	Set definition
*/
expr
	: unorderedsetexpr 
	| orderedsetexpr
	| '(' expr ')'
	;
	
unorderedsetexpr
	: '{' list '}' 						# UnorderedSet
	| '|' list '|' 						# UnorderedSetCardinality /* https://en.wikipedia.org/wiki/Cardinal_number#Cardinal_arithmetic */
	| '{' list '}' COMPLEMENT_SET		# UnorderedComplementSet
	| '{' '}'							# UnorderedEmptySet
	| '{' '}' COMPLEMENT_SET			# UnorderedUniversalSet
	;
	
orderedsetexpr
	: '[' list ']' 						# OrderedSet
	| '|' list '|' 						# OrderedSetCardinality /* https://en.wikipedia.org/wiki/Cardinal_number#Cardinal_arithmetic */
	| '[' list ']' COMPLEMENT_SET		# OrderedComplementSet
	| '[' ']'							# OrderedEmptySet
	| '[' ']' COMPLEMENT_SET			# OrderedUniversalSet
	;
	
list
	: atom ',' list 
	| atom
	;
	