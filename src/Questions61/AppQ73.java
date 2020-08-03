package Questions61;

public class AppQ73 {
	String myStr = "7007";
	public void doStuff(String str){
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);// this convert the string into integer
			
		} catch (NumberFormatException ne) {
			System.out.println("Error");
		}
		System.out.println("myStr:" + myStr + "\nmyNum:" + myNum);
			
	}

	public static void main(String[] args) {
		AppQ73 obj = new AppQ73();
		obj.doStuff("9009");
		
		//Answer myStr:7007
		//       myNum:9009
		

	}

}
