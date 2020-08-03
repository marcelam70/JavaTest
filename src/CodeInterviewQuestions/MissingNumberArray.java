package CodeInterviewQuestions;

public class MissingNumberArray {

	public static void main(String[] args) {
		int a[] = {1,3,4,5,6};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		System.out.println("First result:" + sum);
		int sum1 = 0;
		for (int j = 1; j <=6; j++) {
			sum1 = sum1 + j;
				
		}
		System.out.println("Second result:" + sum1);
		System.out.println("Missing number:" +( sum1-sum));

	}

}
