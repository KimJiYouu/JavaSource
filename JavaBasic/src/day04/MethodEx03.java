package day04;

public class MethodEx03 {
	public static void main(String[] args) {
		
//	return이란
//	1. 메서드에서 return은 실행결과를 돌려주는 값에 대한 타입
//	2. 리턴이 있는 메서드는 다른 메서드이 매개값으로도 사용이 됨
//	3. 반환값은 없을 수도 있음. 없을 경우 void로 선언함
//	4. void메서드도 return을 사용할 수 있음
//		- 대신 값을 돌려주지는 못하고, 종료의 의미로 쓰임
		
	System.out.println(add(1,2)); // 출력 메서드 안에 add 메서드가 매개값으로 사용
	int result = add(add(1,2), add(3,5));
	System.out.println(result);
    
//  void형 메서드는 return이 없기 때문에 단순히 호출만 가능함
//	System.out.println(sub()); 오류 
	sub();
	div(6,2);
	noReturn("bye");
	noReturn("hello");
	
	} // main 메소드 끝
	
	static int add(int a, int b) {
		return a+b;
	}
	
	// <반환값도 없고 매개변수도 없는 유형>
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	// <반환값은 없고 매개변수는 있는 유형>
	static void div(int a, int b) {
		System.out.println(a+" / "+b+" = "+(a/b));
	}
	
	// <반환값이 없을 때 return으로 메서드 종료하기> 
	static void noReturn(String s) {
		if(s.equals("hello")) {  // 문자를 비교할땐 .equals() 메서드 사용
			System.out.println("메서드를 종료합니다");
			return;
		}
		System.out.println("hello를 전달해야 할걸요?");
	}
}
