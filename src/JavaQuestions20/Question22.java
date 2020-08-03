package JavaQuestions20;

public class Question22 {

	public static void main(String[] args) {
	int num = 5;
	do {  //do while loop condition is evaluated after the execution of loop's body
		System.out.println("Answer D: " + num-- + " ");//--num print 4 : num-- print 5 
	}
	while (num==0);// not evaluated
	
	}

}
