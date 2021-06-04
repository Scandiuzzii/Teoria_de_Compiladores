package data_structure;

public class PascalVariable extends PascalSymbol {
	public static  final int INTEGER =0;
	public static final int REAL =1;
	public static final int BOOLEAN =2;
	public static final int STRING =3;
	public static final int NUMBER =4;

	
	private int type;
	private String value;
	
	
	public PascalVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "PascalVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
	}
	
	





	
	
}
