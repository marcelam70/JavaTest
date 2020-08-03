package JavaQuestions1;

	class CD {
	     int r;
	     public CD(int r) {
	    	 this.r = r;
	     	
		}
	     static class DVD extends CD{
	      int c;
			public DVD(int r,int c) {
				//line n1
				//A
				//super.r = r;
				//this.c= c;
				//B
				//super(r);
				//this(c);// constructor call must be the first statement in a constructor
				//C this is the answer
				super(r);
				this.c = c;
				//D
			//	this.c = r;
				//super(c);// constructor call must be the first statement in a constructor
			
			}
			
			public class Question13 {
							
	//	public static void main(String[] args) {
			DVD dvd = new DVD(10,20);

}
}
	     }
//	}