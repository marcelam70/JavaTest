package JavaQuestions20;

public class AQ27 {
	public AQ27() {
		System.out.print("A");
	}
}
	class B extends AQ27{
		public B() {  //line n1
			System.out.print("B");
		}
	}
	class C extends B{
		public C() { //line n2
	
		System.out.print("C");
	}

	public static void main(String[] args) {
		C c = new C();

	}
	}

