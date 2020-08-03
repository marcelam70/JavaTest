package Questions61;

public class Q79 {

	public static void main(String[] args) {
		int n [][] = {{1,3},{2,3}}; 
			for(int i=n.length-1; i>=0; i--){
				for(int y : n[i]){
				System.out.print(y + " ");
				//Output 2313
			}
			
		}
	}

}
