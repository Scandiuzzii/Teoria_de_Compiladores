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
	
	public void verificaID(String id){
		if(!symbolTable.exists(id)){
			throw new PascalSemanticException("Symbol "+_varName+" already declared");
		}
	}
	
}


//PROGRAMA E BLOCO


programa				: 'program' ident SC bloco;
			
bloco 					: partDeclVar? partDecSubRot? comandoComposto;

//Declarações

partDeclVar 				: declVar (SC declVar)*SC;

declVar 				: tipo listIdent;
			
listIdent				: ident{
								_varName = _input.LT(-1).getText();
								_varValue = null;
								symbol = new PascalVariable( _varName, _tipo, _varValue);
								System.out.println("Simbolo adicionado" + symbol);
								if (!symbolTable.exists(_varName)){
									symbolTable.add(symbol);
								}
								else{
									throw new PascalSemanticException("Symbol "+_varName+" already declared");
								}		
						} 
						(V ident{
								_varName = _input.LT(-1).getText();
								_varValue = null;
								symbol = new PascalVariable( _varName, _tipo, _varValue);
								System.out.println("Simbolo adicionado" + symbol);
								if (!symbolTable.exists(_varName)){
									symbolTable.add(symbol);
								}
								else{
									throw new PascalSemanticException("Symbol "+_varName+" already declared");
								}	
						}	
						)*;

partDecSubRot				: (declProced SC)*;
						
declProced				: 'procedure' ident { verificaID(_input.LT(-1).getText()); } 
						paramFormais? SC bloco;
					
paramFormais				: OP secParamFormais (SC secParamFormais)* CP;
			
secParamFormais				: 'var'? listIdent TD ident { verificaID(_input.LT(-1).getText()); };
						
//Comandos

comandoComposto				: 'begin' comando (SC comando)* 'end' {System.out.println("Reconheci um comando composto");};
					
comando					: atribuicao | chamadaProcedimento | comandoComposto | comandoCondicional | comandoRepetitivo;

		
atribuicao				: variavel TDE expressao {System.out.println("Reconheci um comando de atribuicao");};
			
chamadaProcedimento			: ident { verificaID(_input.LT(-1).getText()); } 
						(OP listExpressoes CP)? {System.out.println("Reconheci um comando de chamada de procedimento");};
						
comandoCondicional			: 'IF' expressao 'then' comando ('else' comando)? {System.out.println("Reconheci um comando condicional");};

comandoRepetitivo			: 'while' expressao 'do' comando {System.out.println("Reconheci um comando repetitivo");};

//Expressões
expressao				: expressaoSimples (relacao expressaoSimples)?;

relacao 				: Operacao;	
					
expressaoSimples			: ('+' | '-')? termo (('+' | '-' | 'or') termo)*;
					
termo					: fator (('*' | 'div' | 'and') fator)*;
		
fator					: variavel | numero | OP expressao CP | NOT fator;

variavel				: ident { verificaID(_input.LT(-1).getText()); } 
						| ident { verificaID(_input.LT(-1).getText()); }
						(expressao)? ;
			
listExpressoes				: expressao (V expressao)*;		
		
//Números e idetificadores

numero					: Digito (Digito)*;	
		
identificador				: Letra (Letra | Digito)*;
				
//TIPOS

tipo					: Integer { _tipo = PascalVariable.INTEGER; } 
						| Real    { _tipo = PascalVariable.REAL; }
						| Boolean { _tipo = PascalVariable.BOOLEAN; }
						| String  { _tipo = PascalVariable.STRING; }
						;
				
//TOKENS				
				
Digito					: [0-9];	
				
Letra					: '_' | [a-z] | [A-Z] ;

ident 					: Letras (Letras | Digitos)*;

Operacao				: '=' | '<>' | '<' | '<=' | '>=' | '>';

Digitos					: [0-9] + ('.' [0-9]+)?;

Letras					: [a-z] | [A-Z] ([a-z] | [A-Z] | [0-9] )*;

TRUE					: 'true';

FALSE					: 'false';

SC					: ';';

V					: ',';

OP					: '(';

CP					: ')';

TD					: ':';

TDE					: ':=';

NOT					: 'not';

WS					: (' ' | '\n' | '\t' | '\r') -> skip;