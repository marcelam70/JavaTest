package Questions41;

public class Q55 {

	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		//iVar = fVar;// compile error line 7 cannot convert to float to int
		fVar = iVar; // line 8
		dVar = fVar;// line 9
		//fVar = dVar; //line 10  cannot convert to double to float
		dVar = iVar; //line 11
		//iVar = dVar; //line 12 cannot convert double to int
	}

}
