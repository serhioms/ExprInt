grammar Sets;
WS : [ \t\r]+ -> skip ;
NL : '\n';
INT : [0-9]+;

input: expr NL;

expr: expr ADD_SUB term | term;
term: term MUL factor | factor;
factor: set | '(' expr ')';

ADD_SUB: '|' | '\\';
MUL: '&';

set: '{' list '}' | '{' '}';
list: atom ',' list | atom;
atom: INT;
