package JavaQuestions20;

public class XQ28 {
	static int i;// static take the last value
	int j; 
	public static void main(String[] args) {
		   XQ28 x1 = new XQ28();
		   XQ28 x2 = new XQ28();
		   x1.i = 3;
		   x1.j = 4;
		   x2.i = 5;//java take the last value
		   x2.j = 6; 
		System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j); //}
	
	//Result= 5 4 5 6
				
	
}
}