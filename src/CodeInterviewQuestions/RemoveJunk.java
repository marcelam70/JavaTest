package CodeInterviewQuestions;

public class RemoveJunk {

	public static void main(String[] args) {
	    
		String a = "@#$!^**&=Latin string1234567890";
		String a1 = "##@%Selenium,&^%$#Java,*&^Pyton";
		String a2 ="Mar123ce12la";
		String a3 = "My brithday is %$#05::10-";
		a=a.replaceAll("[^a-zA-Z ]","");
		System.out.println(a);
	
		a1=a1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(a1);
        
        a2=a2.replaceAll("[^a-zA-Z]","");
        System.out.println(a2);
        
        a3=a3.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(a3);
	}

}
