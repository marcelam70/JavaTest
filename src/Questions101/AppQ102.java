package Questions101;

public class AppQ102 {
	 int count;//Unresolved compilation problems: Cannot make a static reference to the non-static field count
	public static void displayMsg(){
	//count++;  //line n1 Unresolved compilation problems
	//System.out.println("Welcome" + "Visit Count:" + count);//line n2 Unresolved compilation problems
	}

	public static void main(String[] args) {
		
         AppQ102.displayMsg();  //line n3
         AppQ102.displayMsg();  //line n4
	}

}
