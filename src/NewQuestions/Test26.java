package NewQuestions;

public class Test26 {

	public static void main(String[] args) {
		int x = 10;
		int y =2 ;
		try {
			for(int z = 2; z >=0; z--){
				int ans = x/z;
				System.out.println(ans + " ");
			}
		} catch (Exception e1) {
			System.out.println("E1");
	//	}catch (ArithmeticException e1) {//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
			System.out.println("E2");
		}
	}//Output = Unresolved compilation problem: 

}
