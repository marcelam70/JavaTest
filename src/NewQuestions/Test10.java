package NewQuestions;

public class Test10 {

	public static void main(String[] args) {
		int a = 2;
		boolean res = false;
		res = a++ == 2 || --a == 2 && --a == 2;  //the first true is run 1+2=3
		System.out.println(a);
		//Output = 3
	}

}
