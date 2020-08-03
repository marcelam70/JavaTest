package Questions61;

public class Q62 {

	public static void main(String[] args) {
		int[] intArr = {8,16,32,64,128};
		//A ava.lang.ArrayIndexOutOfBoundsException: 8
		//for(int i : intArr){
		//System.out.println(intArr[i] + " ");
	//	B result 8 16 32 64 128 
			for(int i : intArr){
		System.out.print(i + " ");
		//C  Unresolved compilation problem:
			//	for(int i =0 : intArr){ //Syntax error, insert "; ; ) Statement" to complete ForStatement
			//	System.out.println(intArr[i] + " ");
			//		i++;
		//D result 0 1 2 3 4 
				//	for(int i = 0; i<intArr.length;i++){
				//	System.out.print(i + " ");
		//E Output 8 16 32 64 128 
					//	for(int i = 0; i<intArr.length;i++){
					//	System.out.print(intArr[i] + " ");	
		//F Output= Unresolved compilation problems: The local variable i may not have been initialized
						//	for(int i ; i<intArr.length;i++){
						//	System.out.println(i + " ");
		}

	}
					}

