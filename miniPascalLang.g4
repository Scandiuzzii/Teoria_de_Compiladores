grammar miniPascalLang;


<<<<<<< HEAD

@header{
	import PascalSymbol;
	import PascalVariable;
	import PascalSymbolTable;
	import PascalSemanticException;
	import java.util.ArrayList;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private PascalSymbolTable symbolTable = new PascalSymbolTable();
	private PascalSymbol symbol;
<<<<<<< HEAD
	
	public void verificaID(String id){
		if(!symbolTable.exists(id)){
			throw new PascalSemanticException("Symbol "+_varName+" already declared");
		}
	}
=======
>>>>>>> parent of 943c220... Em andamento v4
}


//PROGRAMA E BLOCO


<<<<<<< HEAD
programa	: PROGRAM ident  { verificaID(_input.LT(-1).getText()); }SC bloco;
=======
//PROGRAMA E BLOCO


programa	: 'program' ident SC bloco;
>>>>>>> parent of 08655c7... Em andamento
=======
programa	: PROGRAM ident SC bloco;
>>>>>>> parent of 943c220... Em andamento v4

bloco 		: partDeclVar? partDecSubRot? comandoComposto;

//DECLARAÇÕES 

partDeclVar			: declVar (SC declVar)* SC;

declVar 			: tipo listIdent;

<<<<<<< HEAD
listIdent			: ident {
										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new PascalVariable(_varName,_tipo, _varValue);
										if(!symbolTable.exists(_varName)){
											symbolTable.add(symbol);
										}else {
											throw new PascalSemanticException("Symbol"+ _varName+"already declared");
										}
										} 
									(V ident { 
										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new PascalVariable(_varName,_tipo, _varValue);
										if(!symbolTable.exists(_varName)){
											symbolTable.add(symbol);
										}else {
											throw new PascalSemanticException("Symbol"+ _varName+"already declared");
										}
								})*;
=======
listIdent			: ident (V ident)*;
>>>>>>> parent of 08655c7... Em andamento

partDecSubRot		: (declProced SC)*;

<<<<<<< HEAD
declProced			: 'procedure' ident { verificaID(_input.LT(-1).getText()); }
									paramFormais? SC bloco;
									

paramFormais		: OP secParamFormais (SC secParamFormais)* CP;

<<<<<<< HEAD
secParamFormais		: VAR ? listIdent TD ident { verificaID(_input.LT(-1).getText()); };
=======
secParamFormais		: 'var' ? listIdent TD ident;
					
>>>>>>> parent of 08655c7... Em andamento
=======
declProced			: 'procedure' ident paramFormais? SC bloco;

paramFormais		: OP secParamFormais (SC secParamFormais)* CP;

secParamFormais		: VAR ? listIdent TD ident;
>>>>>>> parent of 943c220... Em andamento v4

//COMANDOS

comandoComposto		: 'begin' comando (SC comando)* 'end';

comando				: atribuicao | chamadaProcedimento | comandoComposto | comandoCondicional | comandoRepetitivo;

<<<<<<< HEAD
<<<<<<< HEAD
comandoComposto		: BEGIN comando (SC comando)* END {System.out.println("Comando composto reconhecido!");} ;

atribuicao			: variavel TDE expressao {System.out.println("Comando atribuição reconhecido!");};
=======
atribuicao			: variavel TDE expressao;
>>>>>>> parent of 08655c7... Em andamento

chamadaProcedimento	: ident  { verificaID(_input.LT(-1).getText()); }
									(OP listExpressoes CP)? {System.out.println("Comando chamada de procedimento reconhecido!");}			
									;

<<<<<<< HEAD
comandoCondicional  : IF expressao THEN comando (ELSE comando)? {System.out.println("Comando condicional reconhecido!");};

comandoRepetitivo 	: WHILE expressao DO comando {System.out.println("Comando repetitivo reconhecido!");};
=======
comandoCondicional  : 'if'expressao 'then' comando ('else' comando)?;

comandoRepetitivo 	: 'while' expressao 'do' comando;
>>>>>>> parent of 08655c7... Em andamento
=======
comandoComposto		: BEGIN comando (SC comando)* END ;

atribuicao			: variavel TDE expressao;

chamadaProcedimento	: ident (OP listExpressoes CP)?;

comandoCondicional  : IF expressao THEN comando (ELSE comando)?;

comandoRepetitivo 	: WHILE expressao DO comando;
>>>>>>> parent of 943c220... Em andamento v4


//EXPRESSOES

expressao			: expressaoSimples (relacao expressaoSimples)?;

relacao				: Operacao; 

expressaoSimples	: ('+' | '-')? termo (('+' | '-' | 'or') termo)*;

termo 				: fator(('*' | 'div' | 'and' )fator)*;

fator				: variavel | numero | OP expressao CP | NOT fator ;

<<<<<<< HEAD
variavel			: ident { verificaID(_input.LT(-1).getText()); } 
						| ident  { verificaID(_input.LT(-1).getText()); };
=======
variavel			: ident | ident (expressao)?;
>>>>>>> parent of 943c220... Em andamento v4

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












		
					