package NewQuestions;

public class Test5 {

	public static void main(String[] args) {
		try {
			main(args);
		} catch (Exception e) {
			System.out.println("Catch");
		}
		System.out.println("Out");//nothing in the console
		//main(args) method is invoked without specifying any condition so this code throws java.lang.StackOverflowError
		//this is a subclass of Error type not Exception type

	}

}
