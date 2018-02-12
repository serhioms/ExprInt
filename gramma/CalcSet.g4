grammar CalcSet;
WS 	   : [ \t\r]+ -> skip;
NL     : '\n';
INT    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
PI     : 'pi';
E      : 'e';
POW    : '^';
ID     : [a-zA-Z_][a-zA-Z_0-9]*;

PLUS  : '+';
EQUAL : '=';
MINUS : '-';
MULT  : '*';
DIV   : '/';
LPAR  : '(';
RPAR  : ')';

input
	: setVar NL input	  # ToSetVar 
	| plusOrMinus NL? EOF # Calculate
    | expr				  # SetExpression
	;

setVar
	: ID EQUAL plusOrMinus	# SetVariable
	;

plusOrMinus 
    : plusOrMinus PLUS multOrDiv  # Plus
    | plusOrMinus MINUS multOrDiv # Minus
    | multOrDiv                   # ToMultOrDiv
    ;

multOrDiv
    : multOrDiv MULT pow # Multiplication
    | multOrDiv DIV pow  # Division
    | pow                # ToPow
    ;

pow
    : unaryMinus (POW pow)? # Power
    ;

unaryMinus
    : MINUS unaryMinus # ChangeSign
    | atom             # ToAtom
    ;
        
expr: expr OP_UNION_SUBSTRUCTION term | term;
term: term OP_INTERSECTION factor | factor;
factor: set | '(' expr ')';

OP_UNION_SUBSTRUCTION: '#' | DIV;
OP_INTERSECTION: MULT;

set: '{' list '}' | '{' '}';
list: atom ',' list | atom;

atom
    : PI                    # ConstantPI
    | E                     # ConstantE
    | DOUBLE                # Double
    | INT                   # Int
    | ID                    # Variable
    | LPAR plusOrMinus RPAR # Braces
	;
