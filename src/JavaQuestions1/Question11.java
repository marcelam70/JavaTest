package JavaQuestions1;
interface Readable{
	public void readBook();
	public void setBookMark();
}
abstract class Book implements Readable{ //line n1
	//A
	//class Book implements Readable{ needs abstract class
	public void readBook(){}
	//line n2
	//B
	public abstract void setBookMark();
	

		
	}

//class EBook extends Book{ //line n3
//C this is the answer
	abstract class EBook extends Book{
	public void readBook(){}	
	//line n4
	//D
	public void setBookMark(){}
}
public class Question11 {

}
