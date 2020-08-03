package NewQuestions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test6 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012,1,11);
		Period period = Period.ofMonths(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
		System.out.println(formatter.format(date.minus(period)));
		//date.minus(period) subtract 2 months from period 2012-01-11-->2011-11-11

		//Output = 11-11-11
	}

}
