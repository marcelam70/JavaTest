package Questions101;

public class TestQ137 {
	String name;
	public TestQ137(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		TestQ137[] students = new TestQ137[3];
		students[1]= new TestQ137("Jorge");
		students[2]= new TestQ137("Jake");
		//for(TestQ134 s : students); // cannot convert from element type TestQ137 to TestQ134
		//System.out.println(" "+ name); //s cannot be resolved to a variable
		

	}

}
