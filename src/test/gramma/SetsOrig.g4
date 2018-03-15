grammar SetsOrig;

WS : [ \t\r]+ -> skip;
INT: [0-9]+ ;
NL : '\n';

input: expr NL;

expr: expr OP_ADD term | term;
term: term OP_MUL factor | factor;
factor: set | '(' expr ')';

OP_ADD: '|' | '\\';
OP_MUL: '&';

set: '{' ints '}' | '{' '}';
ints: INT ',' ints | INT;
