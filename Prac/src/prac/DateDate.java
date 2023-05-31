package prac;

import java.time.LocalDate;
import java.util.Date;

public class DateDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate current  = LocalDate.now();
		Date date = new Date();
		
		System.out.println(current);
		System.out.println(date);
		
		if(current.equals(date)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}

	}

}
