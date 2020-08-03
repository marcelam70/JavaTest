package JavaQuestions1;

public class Question4 {

	public static void main(String[] args) {
		Short s1 = 20;
		Integer s2 = 40;
		Long s3 = (long) s1+s2; //line n1
		Double s4 = (double) (s3 *s2); //line2  no cast from long to string
		System.out.println("Sum is:" + s4);
		//A = 600
		//B = Compilation fails line n1
		//C = Compilation fails line n2
		//D = ClassCastExecption is throw in n1
		//E = ClassCastExecption is thrown in n2
		
		//byte<short<char<int<long<float<double
		
		//Answer C

	}

}
