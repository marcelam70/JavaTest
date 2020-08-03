package CertLeadQuestions;

public class Q33 {
	public static void main(String[] args) {
		int x =  5;
		//int x= 6; // with this value answer is line n6 (--x) = 54321
		while(isAvailable(x)){
			System.out.println(x); // --x = line 6 print 43210
			x--; //line 7 x-- = 54321
		}
		
	}
public static boolean isAvailable(int x){
	//return x-- > 0 ? true : false;
	return --x > 0 ? true : false;
}
	
	}


