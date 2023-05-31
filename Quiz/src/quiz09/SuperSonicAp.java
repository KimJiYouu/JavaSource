package quiz09;

public class SuperSonicAp extends Airplane{

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	 * 4. info() 메서드는 이름을 비행기의 이름, 비행모드를 리턴하도록 생성하세요.
	 */

//	멤버변수의 출처를 this. 나 super. 로 표시
	
	int flyMode; // 기본값이 0
	
	SuperSonicAp(String name){
		super(name); // 부모 클래스에 있는 초기화를 참조하게 됨.
//		this.name = name;
	}
	void fly() {
		if(this.flyMode == 1) {
			System.out.println("고속 모드로 비행합니다");
		} else if(this.flyMode == 0) {
			super.fly(); // 부모님의 메서드 호출
		}
	}
	String info() {
		
		return "이름: "+super.name+", "+"모드: "+this.flyMode;
	}
}






