package Questions101;

public class TestQ134 {
	int a1;
	public static void doProduct(int a){
		a=a*a;
	}
	public static void doString(StringBuilder s){
		s.append(" " + s); //this print two times hello
	}

	public static void main(String[] args) {
		TestQ134 item = new TestQ134();
		item.a1 = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb); // this print two times Hello
		doProduct(item.a1);
		System.out.println(i + " " + sb + " " + item.a1);
 
	}

}
