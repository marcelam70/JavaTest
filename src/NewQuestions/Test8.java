package NewQuestions;

public class Test8 {
	private static void add(double d1, double d2){
		System.out.println("double version:" + (d1 + d2));
	}
public static void add (Double d1, Double d2){
		System.out.println("Double version:" +(d1 + d2));// nothing print in the console
		
	}

	public static void main(String[] args) {
		add(10.0, null); //Exception in thread "main" java.lang.NullPointerException
      // add(10, 2); //if i write with two numbers Output is  double version:12.0
      
	}

}
