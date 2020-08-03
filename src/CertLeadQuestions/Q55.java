package CertLeadQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q55 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
LocalDate date2 = LocalDate.of(6, 20,2014);//Exception in thread "main" java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 20
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println("date1 =" + date1);
		System.out.println("date2 =" + date2);
		System.out.println("date3 =" + date3);
		
		//Answer = D but in oracle system has correct answer A

	}

}
