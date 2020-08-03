package Questions61;
class Animal{
	String type = "Canine"; 
    int maxSpeed = 60; 
Animal() {} 
Animal(String type, int maxSpeed) {
	this.type = type; this.maxSpeed = maxSpeed;
	}
}
 class WildAnimal extends Animal{  
	String bounds; 
 public WildAnimal(String bounds) { 
	 //line n1
	 //A Output Canine 60 long
	 super();
	this.bounds = bounds; 
	//B
	//this.bounds = bounds;
	//super(); //Constructor call must be the first statement in a constructor
	//D
	//this("Canine", 60);//The constructor WildAnimal(String, int) is undefined
	//this.bounds = bounds;
	} 
 public WildAnimal(String type, int maxSpeed, String bounds) {
	 //line n2
	 //C Canine 60 null
	//super(type,maxSpeed);
   // this.bounds = bounds;
	//E Output Canine 60 null
	//super(type,maxSpeed);
	//this.bounds = bounds;
	}
 }

public class Q92 {
	public static void main(String[] args) { 
		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
		System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
	}
}
