package CertLeadQuestions;

public class Q23 {

	public static void main(String[] args) {
		int[]stack = {10,20,30};
		int size = 3;
		int indx = 0;
		//line 1
		//A top element 20
		//do{
			//indx++;
		//}while(indx>=size);
		//B  java.lang.ArrayIndexOutOfBoundsException: 3
		//while(indx<size){
		//	indx++;
		//}
		//C top element 30
		do{
			indx++;
		}while(indx<size -1);
		//D  java.lang.ArrayIndexOutOfBoundsException: 4
		//do{
		//	indx++;
		//}while (indx <=size);
		//E java.lang.ArrayIndexOutOfBoundsException: 3
		//while(indx<= size -1){
		//	indx++;
		//}
		
		
		System.out.println("The top element: " + stack[indx]);

	}

}
