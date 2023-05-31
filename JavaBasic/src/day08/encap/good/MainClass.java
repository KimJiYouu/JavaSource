package day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(1995);
		int year = me.getYear();
		System.out.println(year+"년");
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println(month+"월");
		
		me.setDay(25);
		int day = me.getDay();
		System.out.println(day+"일");
				
		me.setSsn("951225-1231231");
		String ssn = me.getSsn();
		System.out.println("주민번호: "+ssn);
	}
}
