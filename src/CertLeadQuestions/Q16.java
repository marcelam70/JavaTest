package CertLeadQuestions;

public class Q16 {

	public static void main(String[] args) {
		String[][] arr = {{"A","B","C"},{"D","E"}};
		//String[] arr = {"A","B","C","D"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				//System.out.print(arr[i]+ " ");
				if (arr[i][j].equals("B")) {
					//if (arr[i].equals("C")) {
					//continue;
					//break;
					
				}
				//	System.out.println("Work done");
				//	break;
				
			}
			continue;
			//Output=  A B C D E 
			//Output = A B D E with break
		//Output second string = A work done
		}
		

	}

}
