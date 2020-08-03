package CodeInterviewQuestions;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num){
		if (num <=1) {
			return false;
			
		}
		for (int i  = 2; i  < num;  i ++) {
			if(num%i == 0){
				return false;
			}
			
		}
		return true;
	}
	public static void getPrimeNumber(int num){
		for(int i = 2;i<num;i++){
			if(isPrimeNumber(i)){
				System.out.println("My prime number is :" + i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(10));
		getPrimeNumber(7);
	
             
	}

}
