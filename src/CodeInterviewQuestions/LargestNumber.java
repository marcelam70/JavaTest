package CodeInterviewQuestions;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int num [] = {-10,24,50,-88,98765};
		int largest = num[0];
		int smallest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i]>largest) {
				largest = num[i];
			}else if (num[i]<smallest) {
				smallest = num[i];
				
			}
			
		}
		//System.out.println(Arrays.toString(num));
		System.out.println("Largest number is:"+ largest);
		System.out.println("Smallest number is: " + smallest);

	}

}
