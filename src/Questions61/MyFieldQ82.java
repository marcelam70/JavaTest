package Questions61;

public class MyFieldQ82 {
	int x;
	int y;
	public void doStuff(int x, int y){
		this.x = x;
		y = this.y ;// this declaration give me 0
	}
	public void display(){
		System.out.println(x + ":" + y + " ");
	}

	public static void main(String[] args) {
		MyFieldQ82 m1 = new MyFieldQ82();
		m1.x = 100;
		m1.y = 200;
		MyFieldQ82 m2 = new MyFieldQ82();
		m2.doStuff(m1.x,m1.y);
		m1.display();//100 200
		m2.display();//100 0
		

	}

}
