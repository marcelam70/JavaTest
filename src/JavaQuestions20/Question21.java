package JavaQuestions20;

public class Question21 {

	public static void main(String[] args) {
		//boolean opt = true; change to String
		//A
	String opt = "true";
	//boolean opt = "true";//boolean is not working in switch case
	//Switch works only with integral types
	//B
	//boolean opt = 1;//we have to change to int
	switch (opt) {
	case "true":  //case true change for case "true"
	//case 1:
		System.out.print("True");
		//C
		break;
		//D
	  default:
		System.out.println("***");
		
	}
       System.out.println("  Done");
	}

}
