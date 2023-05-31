package day10.static_method;

public class MainClass2 {
	public static void main(String[] args) {
		
//		자기 클래스 내부에서 선언된 메서드 사용하기
//		1번 방법 - non-static 메서드는 객체 생성 후 호출가능
		MainClass2 mc = new MainClass2();
		mc.nonStatic();
//		2번 방법 - static 메서드는 그냥 호출가능
		yesStatic();
//		3번 방법 - static 메서드는 클래스명.메서드명으로 호출가능
		MainClass2.yesStatic();
		
		
	}// main 메서드 끝
	
	public void nonStatic() {
	}
	public static void yesStatic() {
	}
}
