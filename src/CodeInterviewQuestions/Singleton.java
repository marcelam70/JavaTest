package CodeInterviewQuestions;

public class Singleton {
	
	//is a class that can only have objects(instance of the class)
	//at a time..How is design this class
	//make constructor as private
	//write a static method(getInstance) that has return
	//type of object of singleton class(Lazy initialization)

private static Singleton singleton_instance = null;
public String str;
private Singleton(){
	str= "Hey How are you bro";
}
	public static  Singleton getIntance() {
		if (singleton_instance==null) 
			singleton_instance = new Singleton();
		return singleton_instance;
			
			
		}
public static void main(String[] args) {
	Singleton x = Singleton.getIntance();
	Singleton y = Singleton.getIntance();
	Singleton z = Singleton.getIntance();
	
	x.str =(z.str).toUpperCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
}
	}


