package JavaQuestions1;

public class Question10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		System.out.println("***" + sb);
		if (sb.equals(s)) {
			System.out.println("March 1");
			
		}else if(sb.toString().equals(s.toString())){
			System.out.println("Match 2");
		}else{
			System.out.println("No Match");
		}


	}

}
