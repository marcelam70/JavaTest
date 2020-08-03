package Questions41;

class Human{
	String name;
	int age = 25;
	public Human(String name) {
	//	this();  //line n1 compiles error both lines  Unresolved compilation problems: 
		         //The constructor Human() is undefined
		setName(name);	
	}
public Human(String name,int age){
//	Person(name);   //line n2 The method Person(String) is undefined for the type Human
	this.name = name;
	setAge(age);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String show(){
	return name + " " + age + " "; //+ number;
}
	}

public class PersonTestQ58 {

	public static void main(String[] args) {
		Human p1 = new Human("Marcela");
		Human p2 = new Human("Jorge",52);
		System.out.println(p1.show());
		System.out.println(p2.show());

	}

}
