package NewQuestions;

public class Test9 {

	public static void main(String[] args) {
		int score = 60;
		switch (score) {
		default:
			System.out.println("Not a valid score");
		//case  score < 70: // Type mismatch: cannot convert from boolean to int
	
			System.out.println("Failed");
			break;
		//case score>= 70:// Type mismatch: cannot convert from boolean to int
			//System.out.println("Passed");
			//break;
		}
		// Output =  Unresolved compilation problems: 
		//           Type mismatch: cannot convert from boolean to int

	}

}
