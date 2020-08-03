package NewQuestions;

import java.util.ArrayList;

public class Q25 {

	public static void main(String[] args){
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true){//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
				myList.add("My string");
			}
		}catch (RuntimeException re) {
			System.out.println("Caugth a RuntimeExecption");
		
		} catch (Exception e) {
			System.out.println("Caught an Exception");
			
		}
		System.out.println("Ready to use");

	}

}
