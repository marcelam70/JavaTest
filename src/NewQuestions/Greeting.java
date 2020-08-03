package NewQuestions;

public class Greeting {
	String greeting = "Welcome";
	public Greeting() {
		this.greeting = "Hello ";
	}

	public static void main(String[] args) {
		Greeting obj = new Greeting();
		String greeting = "Hi";
		System.out.println(obj.greeting);
		
		//Output = Hello

	}

}
