grammar miniPascalLang;


//PROGRAMA E BLOCO


programa	: 'program' ident SC bloco;

bloco 		: partDeclVar? partDecSubRot? comandoComposto;

//DECLARAÇÕES 

partDeclVar			: declVar (SC declVar)*SC;

declVar 			: tipo listIdent;

listIdent			: ident (V ident)*;

partDecSubRot		: (declProced SC)*;

declProced			: 'procedure' ident paramFormais? SC bloco;

paramFormais		: OP secParamFormais (SC secParamFormais)* CP;

secParamFormais		: 'var' ? listIdent TD ident;
					

//COMANDOS

comandoComposto		: 'begin' comando (SC comando)* 'end';

comando				: atribuicao | chamadaProcedimento | comandoComposto | comandoCondicional | comandoRepetitivo;

atribuicao			: variavel TDE expressao;

chamadaProcedimento	: ident (OP listExpressoes CP)?;

comandoCondicional  : 'if'expressao 'then' comando ('else' comando)?;

comandoRepetitivo 	: 'while' expressao 'do' comando;


//EXPRESSOES

expressao			: expressaoSimples (relacao expressaoSimples)?;

relacao				: Operacao; 

expressaoSimples	: ('+' | '-')? termo (('+' | '-' | 'or') termo)*;

termo 				: fator(('*' | 'div' | 'and' )fator)*;

fator				: variavel | numero | OP expressao CP | NOT fator ;

variavel			: ident | ident (expressao)?;

listExpressoes		: expressao (V expressao)*;


//NÚMEROS E IDENTIFICADORES

numero 				: Digitos (Digitos)*;

ident 				: Letras (Letras | Digitos)*;


tipo				: 'integer' | 'real' | 'boolean' | 'char' | 'string';

//TOKENS

Operacao			: '=' | '<>' | '<' | '<=' | '>=' | '>';

Digitos				: [0-9] + ('.' [0-9]+)?;

Letras				: [a-z] | [A-Z] ([a-z] | [A-Z] | [0-9] )*;

TRUE				: 'true';

FALSE				: 'false';

SC					: ';';

V					: ',';

OP					: '(';

CP					: ')';

TD					: ':';

TDE					: ':=';

NOT					: 'not';

WS					: (' ' | '\n' | '\t' | '\r') -> skip;












		
					