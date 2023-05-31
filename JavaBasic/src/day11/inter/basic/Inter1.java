package day11.inter.basic;

public interface Inter1 {

// public static final 이 자동으로 붙어서 상수 취급
	int A = 10;
	
//	메서드를 선언하면 자동으로 추상 메서드가 된다.
	void method01();
	
	
// 인터페이스에는 static, default 메서드 선언이 가능함
	public static void method3() {
		System.out.println("static mehtod");
	}
	
	public default void method4() {
		System.out.println("default method");
	}
}
