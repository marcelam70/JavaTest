package Questions41;
class MyString{
	String msg;
	public MyString(String msg) {
		this.msg = msg;
	}
}
public class Test54 {

	public static void main(String[] args) {
		System.out.println("Hello" + new StringBuilder(" Java SE 8"));
	   System.out.println("Hello " + new MyString(" Java SE 8"));
	   //Answer
   //HelloJava SE 8
  //  HelloQuestions41.MyString@7852e922
	   
	   
	}
}
