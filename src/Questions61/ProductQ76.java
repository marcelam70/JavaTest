package Questions61;

public class ProductQ76 {
//	Answer C,   
	int id; String name;
	public ProductQ76 (int id, String name) { 
		this.id = id;
		this.name = name;  } 
	public static void main(String[] args) { 
		ProductQ76 p1 = new ProductQ76(101, "Pen"); 
		ProductQ76 p2 = new ProductQ76(101, "Pen");
	    ProductQ76 p3 = p1; 
	boolean ans1 = p1 == p2;
	boolean ans2 = p1.name.equals(p2.name);
	System.out.println(ans1 + " : " + ans2);
	
	//Answer false true
	
	}
}
