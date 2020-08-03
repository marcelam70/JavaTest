package CertLeadQuestions;

public class Q30 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		if(x++ < ++y){
			//if(++x < ++y){ // Output = Welcome Log 2:2
			System.out.print("Hello ");
		}else{
			System.out.print("Welcome ");
		}
        System.out.print("Log " + x + ":" + y);
         
         //Output = Hello Log 2:2
		//int avar = 9;
		//if(avar++ <10){
		//	System.out.println(avar + " Hello Universe!");
		//}else{
			//System.out.println(avar + " Hello World");
			//Output = 10 Hello Universe!
		}
	}

//}
