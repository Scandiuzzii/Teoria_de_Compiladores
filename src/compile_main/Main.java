package compile_main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import compile_parser.miniPascalLangLexer;
import compile_parser.miniPascalLangParser;

public class Main {
	public static void main(String[] args) {
		try {
			miniPascalLangLexer lexer;
			miniPascalLangParser parser;

			lexer = new miniPascalLangLexer(CharStreams.fromFileName("input.isi"));

			CommonTokenStream tokenStream = new CommonTokenStream(lexer);

			parser = new miniPascalLangParser(tokenStream);

			parser.programa();

			System.out.println("Compilation Successful");
		} catch (Exception e) {
			System.err.println("ERROR" + e.getMessage());
		}

	}
}