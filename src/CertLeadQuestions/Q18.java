package CertLeadQuestions;

public class Q18 {

	public static void main(String[] args) {
		String[][]chs = new String [5][2]; //other [2][]
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b]= "" + i;
				i++;
				
			}
			
		}
		for(String[]ca : chs){
			for(String cString : ca){
				System.out.print(cString + " ");
			}
			System.out.println();
			//Output =  java.lang.ArrayIndexOutOfBoundsException: 2
		}

	}

}