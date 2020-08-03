package Questions61;

import java.util.ArrayList;
import java.util.List;

class Patient{
	String name;
	public Patient(String name) {
		this.name = name;
	}
}

public class TestQ90 {

	public static void main(String[] args) {
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		//code here
		//A Output Mike Found
		int f = ps.indexOf(p2);
		//B The method Patient(String) is undefined for the type TestQ90
		//int f = ps.indexOf(Patient("Mike"));
		//C
		//int f = ps.indexOf(new Patient( "Mike"));
		//D f cannot be resolved to a variable
		Patient p = new Patient("Mike");
		if (f>=0) { //f cannot be resolved to a variable if i run with option D
			System.out.println("Mike Found");
			
		}

	}

}
