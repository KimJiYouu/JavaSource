package day10.static_basic;

public class Init {

	public static int price = 1000;
	public static String s;
	
	static {
		System.out.println("단 한번 실행됨");
		price = 2000;
	}
	static {
		System.out.println("단 한번 실행됨2");
		s = "hi";
	}
}
