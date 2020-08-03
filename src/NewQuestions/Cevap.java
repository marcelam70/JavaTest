package NewQuestions;

public class Cevap {

	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = new int [2];
		
		b = a;
		int [] z = new int [5];// 12345
		
		z = b; // 123
		for(int i : z){
			System.out.print(i + " "); //Output 123
		}

	}

}
