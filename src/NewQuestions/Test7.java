package NewQuestions;

public class Test7 {

	public static void main(String[] args) {
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("FAlSe");
		Boolean b3 = new Boolean("abc"); // output false
		Boolean b4 = null;
		
		System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
			
   // Output =  true:false:false:null
	}

}
