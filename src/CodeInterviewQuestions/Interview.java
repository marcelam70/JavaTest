package CodeInterviewQuestions;

public class Interview {

	public static void main(String[] args) {
		String string= "∫∆˙√∫∆˙√You got the offer¬˚∆∫˚¬∆∫";
		string = string.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(string);
				
	}

}
