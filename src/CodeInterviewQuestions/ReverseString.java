package CodeInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		 
		//First method
		String str1 = "I love Ecuador";
		String reve = "";
		int len = str1.length();
		for(int i=len-1; i>=0; i--){
			reve=reve+str1.charAt(i);
		}
		System.out.println(reve);
		
		//Second Method
		String string = "I love my country Ecuador";
		for (int i = string.length()-1;i>=0; i--) {
			//System.out.print(string.charAt(i));
			
		}
		
		//Second method
		StringBuffer str2 = new StringBuffer(str1);
		System.out.println(str2.reverse());
	}

}
