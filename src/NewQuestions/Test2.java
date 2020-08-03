package NewQuestions;

public class Test2 {

	public static void main(String[] args) {
		double price = 90000;
		String model;  //=null; we need to initialize variable
		if(price>100000){
			model = "Tesla Model X";
		}else if(price <=100000){
			model = "Tesla Model S";
		}
		//System.out.println(model);// Unresolved compilation problem: 
		//The local variable model may not have been initialized

	}

}
