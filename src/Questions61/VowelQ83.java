package Questions61;

public class VowelQ83 {
	private char var;

	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		VowelQ83 obj1 = new VowelQ83();
		VowelQ83 obj2 = obj1;
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + "," + var2);
		System.out.println(obj1.var + "," + obj2.var);
		
		
	}

}
