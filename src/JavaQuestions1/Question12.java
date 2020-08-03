package JavaQuestions1;

public class Question12 {

	public static void main(String[] args) {
		 String ta = "A1";
	        ta = ta.concat("B1");//A1B1
	        System.out.println(ta);
	        String tb = "C1";  //C1
	        ta = ta.concat(tb);//A1B1C1
	        System.out.println(tb);
	       ta.replace("C", "D");
	       System.out.println(ta);
	        ta = ta.concat(tb); //A1B1C1C1
	        System.out.println(ta);
	        
	      System.out.println("*********"); 
	      
	      String ta1 = "A";
	      ta1 = ta1.concat("B");//AB
	      String tb1 = "C";
	      ta1 = ta1.concat(tb1);//ABC
	      ta1.replace("C","D");
	      ta1 = ta1.concat(tb1);//ABCC
	      System.out.println(ta1);
	      

	}

}
