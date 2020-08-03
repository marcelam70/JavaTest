package CertLeadQuestions;

public class Question14 {

	public static void main(String[] args) {
		Question14 ts = new Question14 ();
		System.out.println(isAvailable + " ");
		isAvailable =  ts.doStuff();//The method doStuff() is undefined for the type Test
		//without this the answer is false false
		System.out.println(isAvailable);

	}
public static boolean doStuff(){
	return !isAvailable;
}
static boolean isAvailable = false;
}
