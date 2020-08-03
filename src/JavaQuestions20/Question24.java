package JavaQuestions20;

public class Question24 {

	public static void main(String[] args) {
	    String [][] chs =new String[2][];
	    chs[0] = new String[2];
	    chs[1] = new String[5];//null is because new string has 2 
	    int i = 97;// this value in a = 97,98 and b = 99,100 
	    for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b] = "" + i;
				i++;
				
			}
		}
        for (String[]ca : chs) {
        	for(String c:ca){
        		System.out.print(c + " ");
        	}
			System.out.println();
			
			
		}
	}

}
