package JavaQuestions20;

public class Employee25 {
	String name;
	boolean contract;
	double salary;
	 Employee25() {
		 //line n1
		 //C---> this works
	 // this.name = new String("Joe");
	 // this.contract = true;
	 // this.salary = 100;
		//D
	//	name = "Joe";
	//	contract = TRUE;// true cannot be resolve to a variable
	//	salary = 100.0f;
		
		//E
		//this.("joe",true,100);// constructor undefined
		
	}
	public String toString(){
		return name +  "," + contract + "," + salary;
	}

	public static void main(String[] args) {
		Employee25 e = new Employee25();
		//line n2
		//A 
		e.name = "Joe";
		e.contract = true;
		e.salary = 100;
		//B
		//this.name = new String("Joe");// this word can not use in static context
		//this.contract = true;
		//this.salary = 100;
		System.out.println("Answer is A and C: " + e);

	}

}
