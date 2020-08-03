package Questions61;

public class Q70 {

	public static void main(String[] args) {
	//	Answer A, B, F
		//A Print one
		//Byte x = 1;
		//B Print one
		//short x = 1;
		//C  Unresolved compilation problems: Type mismatch: cannot convert from int to String
		//String x = "1";
		
		//D Unresolved compilation problems: Type mismatch: cannot convert from int to String
		//Cannot switch on a value of type Long. Only convertible int values, strings or enum variables are permitted
		//Long x = 1;
		
		//E Unresolved compilation problems: Type mismatch: cannot convert from int to Double
		//Double xDouble = 1;
		//F One
	Integer x = new Integer ("1"); 
		switch (x) { 
		case 1: 
			System.out.println("one"); 
			break; 
			case 2: 
				System.out.println("Two"); break;
		}

	}

}
