package day10.static_singleton;

public class MainClass {

	public static void main(String[] args) {

//		StackOverflowError - static을 안붙이면 발생하는 오류: 객체가 무한개 생성
//		Singleton s = new Singleton(); - 객체 직접 생성 불가능
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2); // 세개가 다 같은 객체
		
		
		System.out.println(s.getDomain());
		System.out.println(s1.getDomain());
		System.out.println(s2.getDomain()); // 세개 같음..
	}
}
