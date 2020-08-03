package JavaQuestions20;

public class Question36 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		
		//A
		String str2 = str1;//true this is the answer  
		//B
		//String str2 = new String(str1);//false
		//C
		//String str2 = sb1.toString(); //false
		//D
		//String str2 = "Duke";//false
		
		System.out.println(str1==str2);

	}

}
