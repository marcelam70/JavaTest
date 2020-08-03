package JavaQuestions20;

public class Question20 {

	public static void main(String[] args) {
		int x = 5; // we have to change 6 and then we have 543211
		while(isAvailable(x)){
		x--;    // correct if we put here this
			System.out.print(x + " "); // we have correct too
		}

	}

	private static boolean isAvailable(int x) {
		// TODO Auto-generated method stub
		return x > 0 ? true : false;
	}

}
