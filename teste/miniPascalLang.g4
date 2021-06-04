grammar miniPascalLang;


//PROGRAMA E BLOCO


programa	: PROGRAM ident SC bloco;

bloco 		: partDeclVar? partDecSubRot? comandoComposto;

//DECLARAÇÕES 

partDeclVar			: declVar (SC declVar)*SC;

declVar 			: tipo listIdent;

listIdent			: ident (V ident)*;

partDecSubRot		: (declProced SC)*;

declProced			: 'procedure' ident paramFormais? SC bloco;

paramFormais		: OP secParamFormais (SC secParamFormais)* CP;

secParamFormais		: VAR ? listIdent TD ident;



//COMANDOS
comando				: atribuicao | chamadaProcedimento | comandoComposto | comandoCondicional | comandoRepetitivo;

comandoComposto		: BEGIN comando (SC comando)* END ;

atribuicao			: variavel TDE expressao;

chamadaProcedimento	: ident (OP listExpressoes CP)?;

comandoCondicional  : IF expressao THEN comando (ELSE comando)?;

comandoRepetitivo 	: WHILE expressao DO comando;


//EXPRESSOES

expressao			: expressaoSimples (relacao expressaoSimples)?;

relacao				: Operacao; 

expressaoSimples	: (MAIS | MENOS)? termo ((MAIS | MENOS | OR) termo)*;

termo 				: fator((VEZES | DIV | AND )fator)*;

fator				: variavel | numero | OP expressao CP | NOT fator ;

variavel			: ident | ident (expressao)?;

listExpressoes		: expressao (V expressao)*;


//NÚMEROS E IDENTIFICADORES

numero 				: Digitos (Digitos)*;

ident 				: Letras (Letras | Digitos)*;

tipo				:  INTEGER |  REAL |  BOOLEAN |  CHAR |  STRING;

//TOKENS

PROGRAM				: 'program';

INTEGER				: 'integer';

REAL				: 'real';

BOOLEAN				: 'boolean';

CHAR				: 'char';

STRING				: 'string';

Operacao			: '=' | '<>' | '<' | '<=' | '>=' | '>';

MAIS				: '+';

MENOS				: '-';

OR					: 'or';

VEZES				: '*';

DIV					: 'div';

AND					: 'and';

Digitos				: [0-9] + ('.' [0-9]+)?;

Letras				: [a-z] | [A-Z] ([a-z] | [A-Z] | [0-9] )*;

TRUE				: 'true';

FALSE				: 'false';

SC					: ';';

V					: ',';

VAR					: 'var';

OP					: '(';

CP					: ')';	

TD					: ':';

TDE					: ':=';

NOT					: 'not';

WS					: (' ' | '\n' | '\t' | '\r' | '//' | '{ }') -> skip;

BEGIN				: 'begin' ;

END					: 'end';

IF					: 'if';

THEN 				: 'then';

ELSE 				: 'else';

WHILE				: 'while';

DO					: 'do';










		
					