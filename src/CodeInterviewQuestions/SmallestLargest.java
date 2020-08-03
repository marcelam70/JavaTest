package CodeInterviewQuestions;

import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		
		int [] array = {10,1122,31332,45678,1234,-88,0,4567};
		Arrays.sort(array);
		System.out.println(" Smallest number :" +array[0]);
		System.out.println( "Largest number: " + array[array.length-1]);

	}

}
