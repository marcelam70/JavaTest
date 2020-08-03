package Questions61;

public class EmployeeQ77 {
public int salary;
}
class Manager extends EmployeeQ77{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
	{	
}
	public static void main(String[] args) {
		EmployeeQ77 employee = new EmployeeQ77();
		Manager manager = new Manager();
		Director director = new Director();
		//line n1
		//A
		employee.salary = 50_000;
		//B
		director.salary = 80_000;
		//C
		//employee.budget = 200_000;//created field  budget answer correct
		//D
		manager.budget = 1_000_000;
		//E
	//	manager.stockOptions = 500;//created field stockOptions answer correct
		//F
	director.stockOptions = 1_000;
	}

}
