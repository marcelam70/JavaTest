package CertLeadQuestions;

public class MyFieldQ73 {
	int x;
	int y;
	public void doStuff(int x, int y){
		this.x = x;
		y = this.y;
	}
	public void display(){
		System.out.println(x + " " + y + ":");
	}

	public static void main(String[] args) {
		MyFieldQ73 m1 = new MyFieldQ73();
		m1.x = 100;
		m1.y = 200;
		
		MyFieldQ73 m2 = new MyFieldQ73();
		m2.doStuff(m1.x ,m2.y);
		m1.display(); // 100 200
		m2.display(); // = 100 0
		
	}

}
