package NewQuestions;


class Student{
	String name;
	int age;
	
	void Student(){//this is method
		 Student("James",25);//this is not constructor
	}
	void Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class Test4 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name + ":" +s.age);
     //output = null : 0
	}//if we don't declare constructor java add default values

}
