package Questions41;
class Vehicle{
	int x;
	public Vehicle() {
		this(10); //line n1
	}
	public Vehicle(int x) {
		this.x = x;
		
	}
}
class Car extends Vehicle{
	int y;
	public Car() {
		super();
		//this(20); //line n2  Unresolved compilation problem: Constructor call must be the first statement in a constructor
	}
	Car(int y){
		this.y = y;
		
	}
	public String toString(){
		return super.x + ":" + this.y;
	}
}
public class VehicleQ53 {

	public static void main(String[] args) {
		Vehicle y = new Car();
		System.out.println(y);

	}

}
