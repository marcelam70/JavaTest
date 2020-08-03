package Questions101;

public class PersonQ103 {
	String name;
	int age =25;
public PersonQ103(String name) {
	//this();  // line n1 The constructor PersonQ103() is undefined
	this.name = name;
	setName(name);
}
 public PersonQ103(String name, int age){
	// PersonQ103(name); //line n2 The method PersonQ103(String) is undefined for the type PersonQ103
	 
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
	return name + " " + age;
}
	public static void main(String[] args) {
		PersonQ103 p1 = new PersonQ103("Jesse") ;
		PersonQ103 p2 = new PersonQ103("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());

	}

}
