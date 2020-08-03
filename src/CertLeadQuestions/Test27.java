package CertLeadQuestions;

public class Test27 {
   public static int stvar = 100;
   public int var = 200;
   public String toString(){
	   return stvar + ":" + var;
   }
	public static void main(String[] args) {
		Test27 t1 = new Test27();
		t1.var = 300; // t1 100 300 
		System.out.println(t1 + " ");
		Test27 t2 = new Test27();
		t2.stvar = 300; // t2 300 200
		System.out.println(t2 +  " ");
		//Output = 100:300 
		        // 300:200 

	}

}
