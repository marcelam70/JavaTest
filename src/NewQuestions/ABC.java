package NewQuestions;

public class ABC {

	public static void main(String[] args) {
		String s1 = "ABCEF";
		String s2 = "D";
		System.out.println(s1.indexOf(s2)); // Output = -1
		System.out.println((s1 + s2).indexOf(s2)); //Output = 5
	}

}
