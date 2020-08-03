package CertLeadQuestions;

public class Test77 {
	void readCard(int cardNo) throws Exception{
		System.out.println( "Reading card");
	}
	void checkCard(int cardNo) throws RuntimeException{ //line n1
		System.out.println("Checking Card");
	}

	public static void main(String[] args) {
		Test77 ex = new Test77();
		int cardNo = 12344;
		//ex.readCard(cardNo); //line n2  Output = Unhandled exception type Exception
		ex.checkCard(cardNo); //line n3
		

	}

}
