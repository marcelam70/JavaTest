package Questions101;

public class Q142 {

	public static void main(String[] args) {
		Q142 ts = new Q142();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);

	}
	public static boolean doStuff(){
		return  !isAvailable;
	}
	static boolean isAvailable = false;
	
	//Output false true

}
