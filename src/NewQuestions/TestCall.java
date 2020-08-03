package NewQuestions;
class Caller{
	//private
	void init(){ //change visibility
		System.out.println("Initialized");
	}
	//private 
	void start(){ // change visibility
		init();
		System.out.println("Started");
	}
}
public class TestCall {

	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
		//Output with changed visibility of methods = Initialized
		//Started
		//Initialized


	}

}
