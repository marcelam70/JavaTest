package CertLeadQuestions;

public class Q21 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int i = 0;
		do{
			System.out.print(arr[i] + " ");
			i++;
		}while(i<arr.length +1);//+1 is the exception
		
		
		//Output = Exception in thread "main" 1 2 3 4 java.lang.ArrayIndexOutOfBoundsException: 4

	}

}