package compile_main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import compile_parser.miniPascalLangLexer;
import compile_parser.miniPascalLangParser;
import exceptions.PascalSemanticException;

public class Main {
	public static void main(String[] args) {
		try {
			miniPascalLangLexer lexer;
			miniPascalLangParser parser;

			lexer = new miniPascalLangLexer(CharStreams.fromFileName("input.txt"));

			CommonTokenStream tokenStream = new CommonTokenStream(lexer);

			parser = new miniPascalLangParser(tokenStream);

			parser.programa();

			System.out.println("Compilado com sucesso!");
			
			
			
		} catch (PascalSemanticException e) {
			System.err.println("Semantic error - "+ e.getMessage());
		
		}
		
		catch (Exception e) {
			System.err.println("ERROR" + e.getMessage());
		}

	}
}