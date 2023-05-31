package day10.final_basic;

public class MainClass {
	public static void main(String[] args) {

		
		Person p1 = new Person("123123","Charlie");
//		p1.nation = "England"; 변경 금지
		System.out.println("국적: "+p1.nation+", 번호: "+p1.ssn);

		Person p2 = new Person("234234","Lola");
		System.out.println("국적: "+p2.nation+", 번호: "+p2.ssn);
		
		
		// 상수의 사용 - static 처럼 클래스명.변수명 으로 호출
		System.out.println(Constant.O2); 
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.DOMAIN);
		System.out.println(Constant.VERSION);
	}
}
