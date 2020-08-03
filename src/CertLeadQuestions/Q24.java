package CertLeadQuestions;

public class Q24 {

	public static void main(String[] args) {
		String []strs = new String[2];
		int idx = 0;
		for(String string : strs){
			strs[idx].concat("element" + idx);
			idx++;
		}
         for (idx  = 0; idx < strs.length; idx++) {
        	 System.out.println(strs[idx]);
        	 
        	 //Output =  Exception in thread "main" java.lang.NullPointerException
			
		}
	}

}
