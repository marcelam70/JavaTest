package JavaQuestions20;

public class TestQ37 {
    static int count = 0;// static just have one memory
    int i = 0;
	public  void changeCount() {
		while (i<5) {
			i++;
			count++;
			
		}

	}
	public static void main(String[] args) {
		TestQ37 check1 = new TestQ37();
		TestQ37 check2 = new TestQ37();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + ":" + check2.count);
		//System.out.println(check1.i+ ":" + check2.count + ":" + check1.count);
		
		//answer 10:10
	}
}
