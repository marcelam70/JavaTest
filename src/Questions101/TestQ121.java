package Questions101;

public class TestQ121 {
	public static int stvar = 100;
	public int var = 200;
	public String toString(){
		return var + ":"+ stvar;
	}

	public static void main(String[] args) {
		TestQ121 t1 = new TestQ121();
		t1.var = 300; //  var=300  stvar100
		System.out.println( t1);
		TestQ121 t2 = new TestQ121();
		t2.stvar = 300;//var=200  stvar=300
		System.out.println( t2);
		//Output
		//300:100
		//200:300

	}

}
