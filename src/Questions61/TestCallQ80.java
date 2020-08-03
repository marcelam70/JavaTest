package Questions61;
class Caller{
	private void init(){ // we need to change visibility
	System.out.println("Initialized");
}
   private void start(){//change visibility
	init();
	System.out.println("Started");
}
}
public class TestCallQ80 {

	public static void main(String[] args) {
		Caller c = new Caller();
	//	c.start();
	//	c.init;
	}

}
