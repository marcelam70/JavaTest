package NewQuestions;

public class CardVal {

	public static void main(String[] args) {
		
	//	int cardVal = 6;//Hit
	//	int cardVal = 10;//Double
	//int cardVal = 14; //Stand
		//int cardVal = 16;// Surrender
		int cardVal = 18; //Stand
		switch (cardVal) {
		case 4: case 5: case 6:
		case 7: case 8:
			System.out.println("Hit");	
			break;
		case 9: case 10: case 11:
			System.out.println("Double");
			break;
		case 15: case 16:
			System.out.println("Surrender");
			break;
			default:
				System.out.println("Stand");
		}

	}

}
