package NewQuestions;

import java.util.concurrent.CountDownLatch;

public class App {
	static int count;//change count to static
	public static void displayMsg(){
		 count++; //line n1 error because is not static
		System.out.println("Welcome" + " Visit Count:" + count);//line n2 change count to static
	}
	public static void main(String[] args) {
		App.displayMsg(); //line n3
		App.displayMsg(); //line 4
		
		// Output with static in count = Welcome Visit Count:1
		//                               Welcome Visit Count:2


	}

}
