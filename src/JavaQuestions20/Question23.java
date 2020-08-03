package JavaQuestions20;

public class Question23 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;//100
		int b = ++x;//102
		int c = x++;//102
	//	int d =((a< b)? (a<c) ? a:(b<c)?  b:c; //compilation fails complete expression
	int d = ((a < b) ? (a < c)  ? a  : c : (b < c) ? b : c);
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}

}
