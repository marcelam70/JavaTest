package CertLeadQuestions;

public class Q47 {

	public static void main(String[] args) {
		String [] strings = {"A","B"};
		int idx = 0;
		for(String string : strings){
			strings[idx].concat("element" + idx);
			idx++;
		}
		for (idx  = 0; idx < strings.length; idx++) {
			System.out.println(strings[idx]);
			//Output = A B
			
		}
	}

}
