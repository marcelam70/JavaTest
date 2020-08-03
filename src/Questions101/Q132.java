package Questions101;

public class Q132 {

	public static void main(String[] args) {
		int array[] = {10,20,30,40,50};
		int x = array.length;
		//code here
		//A Output 50 40 30 20 10 
		//while(x>0){
		//	x--;
		//	System.out.print(array[x] + " ");
		//B java.lang.ArrayIndexOutOfBoundsException: -1 Exception in thread "main"
		//do {
		//	x--;
			//System.out.print(array[x] + " ");
		//} while (x>=0);
		//C Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		//while(x>=0){
		//	System.out.println(array[x]);
		//	x--;
	
		//D Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	//	do {
		//	System.out.println(array[x]);
		//	--x;
		//} while (x>=0);
		//E Output 50 40 30 20 10 
		while (x>0){
			System.out.print( array[--x] + " ");
			
		}
		}
		

	}


