package Questions61;

public class MarkList68 {
	int num;
	public static void graceMarks(MarkList68 obj4){
		obj4.num += 10;
	}
	public static void main(String[] args) {
		MarkList68 obj1 = new MarkList68();// one MarkList68 instance was created in memory at runtime
		MarkList68 obj2 = obj1;
		MarkList68 obj3 = null;
		obj2.num = 60;
		graceMarks(obj2);
		

	}

}
