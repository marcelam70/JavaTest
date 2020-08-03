package CertLeadQuestions;
class C {
	public C() {
		System.out.println("C");
	}
}

class B extends C{
	public B(){
		System.out.println("B");
	}
}
public class A  extends B{
	public A() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		A a = new A();
     
		//Output C B A
	}

}
