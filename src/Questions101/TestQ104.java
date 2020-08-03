package Questions101;

public class TestQ104 {

	static int count = 0;
	int i = 0;
	public void changeCount(){
		while(i<5){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		TestQ104 check1 = new TestQ104();
		TestQ104 check2 = new TestQ104();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + ":" + check2.count);
      //Output
		//10:10
	}

}
