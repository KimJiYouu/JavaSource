package day11.inter.basic;

//	인터페이스를 상속받을 때는 implements 키워드를 사용
//  인터페이스는 다중 상속이 가능함
public class Basic implements Inter1, Inter2 {

//  인터페이스에 있는 추상 메서드는 반드시 overriding 되어야 함
	@Override
	public void method01() {
		System.out.println("재정의된 1번 메서드 사용");
	}

	@Override
	public void mehtod02() {
		System.out.println("재정의된 2번 메서드 사용");
	}
	
	public void method03() {
		System.out.println("나의 3번 메서드 사용");
	}
}
