grammar miniPascalLang;



@header{
	import data_structure.PascalSymbol;
	import data_structure.PascalVariable;
	import data_structure.PascalSymbolTable;
	import exceptions.PascalSemanticException;
	import java.util.ArrayList;

}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private PascalSymbolTable symbolTable = new PascalSymbolTable();
	private PascalSymbol symbol;
	
	public void verifiqueID(String id){
		if(!symbolTable.exists(id)){
			throw new PascalSemanticException("Symbol " +_varName+"  already declared");
		}
	}
}


//PROGRAMA E BLOCO


programa	: PROGRAM ident {verifiqueID(_input.LT(-1).getText()); } SC bloco;

bloco 		: partDeclVar? partDecSubRot? comandoComposto;

//DECLARAÇÕES 

partDeclVar			: declVar (SC declVar)*SC;

declVar 			: tipo listIdent;

listIdent			: ident {
										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new PascalVariable(_varName,_tipo, _varValue);
										if(!symbolTable.exists(_varName)){
											symbolTable.add(symbol);
										}else {
											throw new PascalSemanticException("Symbol"+ _varName+"2 already declared");
										}
										} 
									(V ident { 
										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new PascalVariable(_varName,_tipo, _varValue);
										if(!symbolTable.exists(_varName)){
											symbolTable.add(symbol);
										}else {
											throw new PascalSemanticException("Symbol"+ _varName+" 3 already declared");
										}
								})*;

partDecSubRot		: (declProced SC)*;

declProced			: 'procedure' ident {verifiqueID(_input.LT(-1).getText()); } 
									paramFormais? SC bloco;
									

paramFormais		: OP secParamFormais (SC secParamFormais)* CP;

secParamFormais		: VAR ? listIdent TD ident { verifiqueID(_input.LT(-1).getText()); };



//COMANDOS
comando				: atribuicao | chamadaProcedimento | comandoComposto | comandoCondicional | comandoRepetitivo;

comandoComposto		: BEGIN comando (SC comando)* END {System.out.println("Comando composto reconhecido!");} ;

atribuicao			: variavel TDE expressao {System.out.println("Comando atribuição reconhecido!");};

chamadaProcedimento	: ident {verifiqueID(_input.LT(-1).getText());}
									(OP listExpressoes CP)? {System.out.println("Comando chamada de procedimento reconhecido!");}			
									;

comandoCondicional  : IF expressao THEN comando (ELSE comando)? {System.out.println("Comando condicional reconhecido!");};

comandoRepetitivo 	: WHILE expressao DO comando {System.out.println("Comando repetitivo reconhecido!");};


//EXPRESSOES

expressao			: expressaoSimples (relacao expressaoSimples)?;

relacao				: Operacao; 

expressaoSimples	: (MAIS | MENOS)? termo ((MAIS | MENOS | OR) termo)*;

termo 				: fator((VEZES | DIV | AND )fator)*;

fator				: variavel | numero | OP expressao CP | NOT fator ;

variavel			: ident {verifiqueID(_input.LT(-1).getText());}
						| ident {verifiqueID(_input.LT(-1).getText()); } (expressao)?;

listExpressoes		: expressao (V expressao)*;


//NÚMEROS E IDENTIFICADORES

numero 				: Digitos (Digitos)*; 

ident 				: Letras (Letras | Digitos)*;

tipo				:  INTEGER {_tipo = PascalVariable.INTEGER;} 
					| REAL {_tipo = PascalVariable.REAL;} 
					| BOOLEAN {_tipo = PascalVariable.BOOLEAN;} 
					| STRING {_tipo = PascalVariable.STRING;}
					;

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










		
					