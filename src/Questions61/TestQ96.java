package Questions61;
 class A{
	 public void test(){
	 System.out.println("A");
 }
 }
 class B extends A{
	 public void test(){
		 System.out.println("B");
	 }
	 
 }
  class C extends A{
	 public void test(){
		 System.out.println("C");
	 }
 }
public class TestQ96 {

	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new C();
		b1 = (A) b2;
		A b3 = (B) b2; // line n1
		//A b3 = (B) b2; // line n2  Unresolved compilation problem: Duplicate local variable b3
		b1.test();
		b3.test();
	}

}
