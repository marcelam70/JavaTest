package Questions101;

public class Q139 {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		if(x++ > ++y){ // x = 2  y = 1 false 
			System.out.println("Hello");
		}else{
			System.out.println("Welcome");
		}
		System.out.println("Log " + x + ":" + y);
		
		//Output Welcome
		//       Log 2:1
	}

}
