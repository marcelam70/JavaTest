package NewQuestions;


public class Test11 {
	private static void m1() throws Exception{
		throw new Exception();
	}

	public static void main(String[] args) {//throws Exception { with this output is Exception in thread "main" A
		try {
		//	m1(); // Unresolved compilation problem: 
			//Unhandled exception type Exception
		} finally {
			System.out.println("A");
		} {
			
		}
	}

}
