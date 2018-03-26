grammar CalcSet;
/*
	Expression lexems https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation
*/
WS			: [ \t\r]+ -> skip;
NL			: '\n';
INT			: [0-9]+;
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
EQUAL			: '==';
NEQUAL			: '!=';
AND			: '&&';
OR			: '||';
NOT			: '!';

/*
	Boolean algebra
*/
IMPLICATION		: '->';

/*
	More boolean and number https://en.wikipedia.org/wiki/Boolean_algebra
*/
NAND			: '!&';
NOR			: '!|';
XOR			: 'X|';
XNOR			: 'X!';

/* 
	Sets https://en.wikipedia.org/wiki/Set_(mathematics)
 */
INTERSECTION		: '&';
UNION			: '|';
COMPLEMENTS		: '\\';
SUBSET			: '@';
COMPLEMENT_SET		: '\'';   /* https://en.wikipedia.org/wiki/Complement_(set_theory) */
DISJUNCTIVE_UNION	: '/\\';  /* https://en.wikipedia.org/wiki/Symmetric_difference */

/*
	Input string - expression
*/
input
	: assign NL input		# ToAssign
	| orand NL			# Calculate
	;

assign
	: ID ASSIGN orand		# SetVariable
	;

orand 
    : orand OR equalgrls  		# Or
    | orand XOR equalgrls  		# Xor
    | orand NOR equalgrls  		# Nor
    | orand XNOR equalgrls  		# Xnor
    | orand AND equalgrls		# And
    | orand NAND equalgrls		# Nand
    | equalgrls                  	# ToEqualNotequal
    ;

equalgrls
    : equalgrls EQUAL plusminus 	# Equal
    | equalgrls NEQUAL plusminus	# Nequal
    | equalgrls GR plusminus		# Greater
    | equalgrls GRE plusminus		# GreaterEqual
    | equalgrls LS plusminus		# Less
    | equalgrls LSE plusminus		# LessEqual
    | plusminus				# ToPlusOrMinus
	;
	
plusminus 
    : plusminus PLUS implicationsubset  		# Plus
    | plusminus MINUS implicationsubset			# Minus
    | implicationsubset              			# ToImplicationSubset
    ;

implicationsubset
    : implicationsubset IMPLICATION multdiv		# ImplicationSet
    | implicationsubset SUBSET multdiv			# SubSet
    | multdiv						# ToUnion
    ;

multdiv
    : multdiv MULT uniondisjunctive			# Multiplication
    | multdiv DIV uniondisjunctive			# Division
    | uniondisjunctive					# ToBit
    ;

uniondisjunctive
    : uniondisjunctive UNION intersectioncomplements  			# UnionSet
    | uniondisjunctive DISJUNCTIVE_UNION intersectioncomplements  	# DisjunctiveUnion
    | intersectioncomplements						# ToIntersectionComplements
    ;

intersectioncomplements
    : intersectioncomplements INTERSECTION bit		# IntersectionSet
    | intersectioncomplements COMPLEMENTS bit		# ComplementsSet
    | bit						# ToMultOrDiv
    ;

bit
    : bit BIT_LEFT power				# BitLeft
    | bit BIT_RIGHT power				# BitRight
    | bit BIT_RIGHTU power				# BitRightUnsigned
    | bit BIT_XOR power					# BitXor
    | power						# ToPow
    ;

power
    : unarycomplementsbitinvers (POW power)? 		# PowerPower
    ;

unarycomplementsbitinvers
    : MINUS unarycomplementsbitinvers 			# ChangeSign
    | NOT unarycomplementsbitinvers			# UnaryNot
    | unarycomplementsbitinvers COMPLEMENT_SET		# ComplementSet
    | BIT_INVERS unarycomplementsbitinvers		# BitInvers
    | atom             					# ToAtom
    ;

atom
    : ID				# Variable
    | MATH_PI				# ConstantPI
    | MATH_E				# ConstantE
    | STRING				# String
    | TRUE				# ConstantBoolean
    | FALSE				# ConstantBoolean
    | DOUBLE				# Double
    | INT				# Int
    |  '(' orand ')'			# Braces
    |  '|' orand '|'			# Cardinality /* https://en.wikipedia.org/wiki/Cardinal_number#Cardinal_arithmetic */
    | '||' orand '||'			# Norm /* https://en.wikipedia.org/wiki/Norm_(mathematics) */
    | expression			# ToExprFrAtom
	;

/*
	Set definition
*/
expression
	: unorderedset 
	| orderedset
	| '(' expression ')'
	;
	
unorderedset
	: '{' list '}' 			# UnorderedPair
	| '{' list '}' COMPLEMENT_SET	# UnorderedComplementSet
	| '{' '}'			# UnorderedEmptySet
	| '{' '}' COMPLEMENT_SET	# UnorderedUniversalSet
	;
	
orderedset
	: '[' list ']' 			# OrderedPair
	| '[' list ']' COMPLEMENT_SET	# OrderedComplementSet
	| '[' ']'			# OrderedEmptySet
	| '[' ']' COMPLEMENT_SET	# OrderedUniversalSet
	;
	
list
	: atom ',' list 
	| atom
	;
	
