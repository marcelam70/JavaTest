package Questions41;

import java.util.ArrayList;

public class Q45 {

	public static void main(String[] args) {
		ArrayList myList  = new ArrayList();
		String[] myArray;
		try {
			while (true){
				myList.add("My String");
			}
			
		} catch (RuntimeException re) {
			System.out.println("Caught a RunTimeException");
			
		}
		catch (Exception e) {
			System.out.println("Caught an Exception");
		}
        System.out.println("Ready to use");
        //Answer = Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	}

}
