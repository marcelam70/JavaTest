package CertLeadQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class LocalDate1 {

	public static void main(String[] args) {
	LocalDateTime dt  = LocalDateTime.of(2014, 7,31,1,1);
	dt.plusDays(30);
	dt.plusMonths(1);
	System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	
	//Output = 2014-07-31
	System.out.println("****************");
	
	int sum = 0;
	for(int x = 1; x <= 5; x++){
		sum = sum + x;
		//System.out.print(x + ":");
		//System.out.print(sum +":");
		System.out.println( " X is: " + x + ": "+ "Sum is:" + sum);
		
	// Output= X is: 1: Sum is:1
		      //  X is: 2: Sum is:3
		     // X is: 3: Sum is:6
		     // X is: 4: Sum is:10
		    // X is: 5: Sum is:15
		
	}
	

	}

}
