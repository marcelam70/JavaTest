package Questions41;

public class Q49 {

	public static void main(String[] args) {
		String str = " ";
		str.trim();//trim method checks this unicode value before and after string
		//If it exists then removes the spaces and returns the omitted string
		System.out.println(str.equals("") + " " + str.isEmpty());
		
         //  Answer = false false
	}

}
