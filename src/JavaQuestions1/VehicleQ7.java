package JavaQuestions1;

public class VehicleQ7 {
	String type = "4W";
	static int maxSpeed = 100;
	 public VehicleQ7(String type,int maxSpeed) {
		 this.type = type;
		 this.maxSpeed = maxSpeed;	
	}
	 public VehicleQ7() {// created constructor with any parameter
	
	}
}
 class Car extends VehicleQ7{
	String trans;
	 Car(String trans) {  //line n1 compilation fails  Answer C or E
	this.trans = trans;
	}
	 Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		//this.(trans); //line n2 compilation fails
		this.trans = trans;

	}
public static void main(String[] args) {
	//I can not create non-parameter constructor in subclass If i don't have a non-parameter constructor 
	//one parameter can use non-parameter inside itself
	//two parameter can use one parameter inside
		
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W",150,"Manual");
	System.out.println(c1.type + " " + VehicleQ7.maxSpeed + " "+  c1.trans);
	System.out.println(c2.type + " " + c2.maxSpeed + " "+  c2.trans);
}
}
