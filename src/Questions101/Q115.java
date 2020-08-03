package Questions101;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q115 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format (DateTimeFormatter.ISO_DATE));
		
        //Output
		//2014-07-31
	}

}
