package JavaQuestions1;

public class TestCardQ19 {
	void readCard(int cardNo)throws Exception{
		System.out.println("Reading card");
	} 
	void checkCard( int cardNo) throws RuntimeException{ // line n1
		System.out.println( "checking card");
	}
		public static void main(String[] args) { //throws Exception{//we have to use throws key
			TestCardQ19 ex = new TestCardQ19();
			int cardNo = 12344;
			ex.checkCard(cardNo);//line n2
			//ex.readCard(cardNo); //line n3 compile error 

		}

	}

