package CertLeadQuestions;

import java.time.LocalDate;

public class Question11 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012,01,32);//Invalid value for DayOfMonth (valid values 1 - 28/31): 32
		date.plusDays(10);
		System.out.println(date);

	}

}
