package Questions61;

public class Q93 {

	public static void main(String[] args) {
		String names [] = {"Thomas", "Peter", "Joseph"};
		String pwString [] = new String[3];
		int idx = 0;
		try {
			for (String nString : names) {
				pwString[idx]= nString.substring(2,6);
				idx++;
				
			}
		} catch (Exception e) {
			System.out.println("Invalid Name");
		}
		for(String p : pwString){
			System.out.println(p);
		}
		//Output
		//Invalid Name
		//omas
		//null
		//null
			
	}

}
