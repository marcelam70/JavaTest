package Questions101;

public class Test132 {
        int x,y;
        public Test132(int x, int y) {
        	this.x = x;
        	this.y = y;
			
		}
        public void initialize(int x, int y){
        	this.x = x*x;
        	this.y = y*y;
        }
        	
        
	public static void main(String[] args) {
		int x = 3, y = 5;
		Test132 obj = new Test132(x, y);
		System.out.println(x + " " + y);
		
		//Output 3 5
		
	}

}
