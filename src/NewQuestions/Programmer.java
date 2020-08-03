package NewQuestions;
abstract class Writer{
	public static void write(){
		System.out.println("Writing....");
	}
	class Author extends Writer{
		//public static void write(){
		//	System.out.println("Writing a book");
		}
	}
//}

public class Programmer extends Writer {
	public static void write(){
		System.out.println("Writing code..");
	}

	public static void main(String[] args) {
		Writer writer = new Programmer();
		writer.write();
		
		//Output = Writing.....

	}

}
