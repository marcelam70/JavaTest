package Questions41;

public class CCMaskQ42 {
	public static String maskCC(String creditCard) { 
		String x = "XXXX-XXXX-XXXX-"; 
		// line n1 
		//A print all numbers and xxx
		//StringBuilder sb = new StringBuilder(creditCard); 
	   // sb.substring(15,19);
	    //return  x + sb ;
		//B correct answer
		return x + creditCard.substring(15, 19); 
		//C correct answer
		//StringBuilder sb = new StringBuilder(x); 
	    //sb.append(creditCard, 15, 19);
	    //return sb.toString();
	    //D print all numbers and xxx
	   // StringBuilder sb = new StringBuilder(creditCard); 
	   // StringBuilder s= sb.insert(0, x);    
	   // return s.toString();
	    } 
	public static void main(String[] args) { 
		
		System.out.println(maskCC("1234-5678-9101-1121"));
		}
	
	
	}	

	


