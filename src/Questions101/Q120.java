package Questions101;

public class Q120 {

	public static void main(String[] args) {
		float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
		float var2 = var1 + 1024;//12456 + 1024 = 13480.0
		System.out.println(var2);
      //Output=  13480.0
	}

}
