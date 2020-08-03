package Questions101;

public class Q110 {

	public static void main(String[] args) {
		int [] stack = {10,20,30};
		int size = 3;
		int idx = 0;
		//line n1
		//A The top element: 20
		//do{
		//	idx++;
	//	}while(idx>=size);
		//B  The top element: 20  The top element: 30 java.lang.ArrayIndexOutOfBoundsException: 3
	//	while (idx< size){
		//	idx++;
			//C The top element: 30
			do {
				idx++;
			} while (idx<size-1);
			//D java.lang.ArrayIndexOutOfBoundsException: 4
			//do {
				//idx++;
			//} while (idx<=size);
			//E
			//while (idx<=size-1);{
			//idx++;	
	
		System.out.println("The top element: "+ stack[idx]);
}
	}

