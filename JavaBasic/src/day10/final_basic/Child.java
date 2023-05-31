package day10.final_basic;

public class Child extends Parent {

//	final 클래스 - 상속 금지
//	final 메서드 - 오버라이드 금지

//	override
	public void method01() {
		this.method02(); // final메서드 호출은 가능
	}

//	public void method02() {} 오버라이드 안됨
}
