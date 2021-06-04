package data_structure;

import java.util.HashMap;

public class PascalSymbolTable {
	private HashMap<String, PascalSymbol> map;
	
	public PascalSymbolTable() {
		map = new HashMap<String, PascalSymbol> ();
	}
	
	public void add(PascalSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	
	public PascalSymbol get(String symbolName) {
		return map.get(symbolName); 
	}

}
