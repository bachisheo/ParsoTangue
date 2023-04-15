grammar ParsoTangue;

//Tokens
fragment WORD: [a-zA-Z_];
fragment DIGIT: [0-9];

//Constants
INT_NUMBER: '0' | [1-9][0-9]*;
STRING:  '"' .*? '"';
NAME: WORD (WORD | DIGIT)*;
BOOL : 'true' | 'false';

//Skipped fragments
COMMENT: '//'.*? '\n' -> skip;
WHITESPACE : [ \t\r\n\u000C] -> skip;

//Rules
file
    : functionDecl* EOF;

functionDecl
    :'let' (type | voidType) NAME '(' paramsList? ')' block
    ;
paramsList
    : param (',' param)*
    ;
param
    : type NAME
    ;

type
    : 'Integer'
    | 'String'
    | 'Boolean'
    ;
voidType
    : 'void'
    ;
block
    : '{' inFuncDescription* '}'
    ;
inFuncDescription
    : expr EOE
    | operator
    ;

expr
    : '(' expr ')'                                  #bracketsExpr
    | op=(PLUS|MINUS) expr                             #unaryExpr
    | left=expr op=(ASTERISK|SLASH|MOD) right=expr                    #infixExpr
    | left=expr op=(PLUS|MINUS) right=expr                        #infixExpr
    | left=expr op=(LEQ|GEQ|LESS|GREATER) right=expr              #infixExpr
    | left=expr op=(EQ|NEQ) right=expr                            #infixExpr
    | NAME '('argsList?')'                          #functionCallExpr
    |literal                                        #literalExpr
    |NAME                                           #varExpr
    ;

argsList
    : expr (',' expr)*
    ;
literal
    : BOOL
    | STRING
    | INT_NUMBER
    ;
operator
    : assignOperator                                    #assignOp
    | varDeclaration                                    #varDeclOp
    | 'if' '(' expr ')' true_st=operator ('else' false_st=operator)?     #ifOp
    | block                                             #blockOp
    | 'return' (expr)? EOE                                 #retOp
    ;
assignOperator
    : NAME ASSIGMENT expr EOE
    ;
varDeclaration
    : type NAME ASSIGMENT val=expr EOE
    ;

//Keywords
ASTERISK            : '*' ;
SLASH               : '/' ;
MOD                : '%' ;
PLUS                : '+' ;
MINUS               : '-' ;
ASSIGMENT           : ':=';
LESS                : '<';
GREATER             : '>';
LEQ                 : '<=';
GEQ                 : '>=';
EQ                  : '==';
NEQ                 : '!=';
EOE                 : ';';
QUOT                : '"';
