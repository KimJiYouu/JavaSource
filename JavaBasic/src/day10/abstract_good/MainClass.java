package day10.abstract_good;

public class MainClass {
	public static void main(String[] args) {

//	1. 추상메서드를 사용하면 overriding이 강제화되어서 
//	프로그래머의 오버라이딩 실수를 줄일 수 있다
		
		SeoulStore s1 = new SeoulStore();
		s1.apple();
		s1.grapes();
		s1.orange();
		s1.melon();
		s1.newMenu(); // 부모클래스로부터 상속받은 것
		System.out.println(s1.getName()); // 부모클래스로부터 상속받은 것
		s1.k();
		
		System.out.println("===================");
		
//	2. 객체의 추상화 == 다형성의 사용
//	=> 추상클래스는 객체로 생성이 안되기 떄문에 자식으로 생성해서 부모타입으로 구체화하여 사용
//		Store s = new Store(); -> 생성 불가
		
		Store s2 = new BusanStore(); // 부모클래스 타입으로 받아도 가능
		s2.apple();
		s2.grapes();
		s2.orange();
		s2.melon();
		s2.newMenu(); // 부모클래스로부터 상속받은 것
		System.out.println(s2.getName()); // 부모클래스로부터 상속받은 것
//		s2.j();  다형성을 이용하여 생성하면 BusanStore만의 기능은 사용불가
	}
}
