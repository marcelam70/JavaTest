package Questions101;

public class Q112 {

	public static void main(String[] args) {
		String str1 = "Java";
		String [] str2 = {"J","a","v","a"};
		String str3 = "";//with space output is false false
		for(String str : str2){
			str3 = str3 + str;
		}
		boolean b1 = (str1 == str3);
		boolean b2 = (str1.equals(str3));
		System.out.println(b1 + ", " + b2);
		
		//Output
		//false, true

	}

}
