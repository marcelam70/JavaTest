package CodeInterviewQuestions;

public class ReveWithWhile {

	public static void main(String[] args) {
		
	//	int num1 = 12345667;
	//	System.out.println(new StringBuffer(String.valueOf(num1).reverse()));

		int num = 12345678, rev=0;
		while ( num!=0){
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reversed :" + rev);
	
	}
	
}
