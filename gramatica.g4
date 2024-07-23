grammar gramatica;

program : exp EOF ; 

exp: ID #Var
          | num #Const
          | exp '+' exp #Soma
          | exp '-' exp #Sub
          | exp '*' exp #Mult
          | exp '/' exp #Div
          | '(' exp ')' #Par
          | exp '^' num #Pot
          ;

num: DIGIT+;
ID: 'X';
DIGIT: [0-9];
WS: [ \t\r\n]+ -> skip; 
