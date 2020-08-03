package CertLeadQuestions;

public class Test105 {
//	int x,y;
//	public Test105(int x,int y){
//		initialized(x,y);
//	}
//	public void initialized(int x, int y){
//		this.x = x * y;
//		this.y = y * y;
//	}
//
	public static void main(String[] args) {
//		int x = 9, y = 5;
//		Test105 obj = new Test105(x,y);
//		System.out.println(x + " " + y);
		
		//Output =  9 5
		
		
		Test105 ts = new Test105();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff(); //true
			System.out.println(isAvailable);
		
	}
	public static boolean doStuff(){
		return !isAvailable; //Always false !
	}
	static boolean isAvailable = false; //false

}
