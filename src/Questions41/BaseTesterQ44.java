package Questions41;

class Base{
	public void test(){
		
	}
}
class DerivedA extends Base{
	public void test(){
		System.out.println("DerivedA");
	}
}
class DerivedB extends DerivedA{
	public void test(){
		System.out.print("DerivedB" + " ");
	}
}
public class BaseTesterQ44 {

	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		b1 = (Base) b3;//DerivedB 
		Base b4 = (DerivedA) b3;//DerivedB 
		b1.test();
		b4.test();
		//Answer DerivedB DerivedB 

}
}