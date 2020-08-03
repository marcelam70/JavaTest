package JavaQuestions1;

public class Question18 {

	public static void main(String[] args) {
		String shirts [][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		//A
//		for (int index = 1; index < 2; index++) {// only print medium
//			for (int idx = 1; idx < 2; idx++) {
//				System.out.println( shirts[index][idx] + ":");
				//B
	//	for (int index = 0; index < 2; index++) {
	//				for (int idx = 0; idx < index; ++idx) {
	//					System.out.println( shirts[index][idx] + ":");//print  small
		//C
//		for (String  cString : colors) {
//			for (String s : sizes) {
//				System.out.println( s+ ":");// we have to create variables colors sizes
		//new option = red:blue:small:medium:
		// for (String[] c:shirts){
		//for (String s : c){
		//System.out.print(s + ":");
		//D red:blue:small:medium:
		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
			System.out.println( shirts[index][idx] + ":");//print red blue small medium
		 idx++;
			}
			index++;
		}		
	}
	}
	
	


