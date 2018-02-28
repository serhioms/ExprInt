grammar CalcSet;
WS 	   : [ \t\r]+ -> skip;
NL     : '\n';
INT    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
PI     : '_pi';
E      : '_e';
TRUE   : 'true';
FALSE  : 'false';
POW    : '^';
ID     : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"' ~( '\r' | '\n' | '"' )* '"';

PLUS		: '+';
ASSIGN		: '=';
AND			: '&';
OR			: '|';
COMPLEMENTS	: '\\';
EQUAL		: '==';
NEQUAL		: '!=';
IMPLICATION	: '->';
NOT			: '!';
MINUS		: '-';
MULT		: '*';
SUBSET		: '@';
CARDINALITY	: '#';
DIV			: '/';
LPAR		: '(';
RPAR		: ')';

OP_UNION_SUBSTRUCTION: PLUS | MINUS;
OP_INTERSECTION: MULT;

input
	: setVar NL input		# ToSetVar 
	| plusOrMinus NL? EOF	# Calculate
	;

setVar
	: ID ASSIGN plusOrMinus	# SetVariable
	;

plusOrMinus 
    : plusOrMinus PLUS multOrDiv  		# Plus
    | plusOrMinus MINUS multOrDiv		# Minus
    | plusOrMinus EQUAL multOrDiv 		# Equal
    | plusOrMinus NEQUAL multOrDiv		# Nequal
    | plusOrMinus OR multOrDiv  		# Or
    | plusOrMinus AND multOrDiv			# And
    | plusOrMinus IMPLICATION multOrDiv	# Implication
    | plusOrMinus COMPLEMENTS multOrDiv	# Complements
    | plusOrMinus SUBSET multOrDiv		# Subset
    | multOrDiv                  		# ToMultOrDiv
    ;

multOrDiv
    : multOrDiv MULT pow			# Multiplication
    | multOrDiv DIV pow				# Division
    | pow							# ToPow
    ;

pow
    : unaryMinus (POW pow)? 		# Power
    ;

unaryMinus
    : MINUS unaryMinus 				# ChangeSign
    | NOT unaryMinus				# UnaryNot
    | CARDINALITY unaryMinus		# Cardinality
    | atom             				# ToAtom
    ;
        
        
expr
	: expr OP_UNION_SUBSTRUCTION term 	
	| term								
	;
term
	: term OP_INTERSECTION factor 		
	| factor							
	;
	
factor: set | '(' expr ')';

set: '{' list '}' | '{' '}';
list: atom ',' list | atom;

atom
    : ID                    # Variable
    | PI                    # ConstantPI
    | E                     # ConstantE
    | STRING				# String
    | TRUE                  # Boolean
    | FALSE                 # Boolean
    | DOUBLE                # Double
    | INT                   # Int
    | LPAR plusOrMinus RPAR # Braces
    | expr					# AtomExpr
	;
