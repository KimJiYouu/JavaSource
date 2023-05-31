package day05;

// 설계도로 사용할 클래스는 메인이 없음
public class Pen {

//	 클래스 속성(값 저장)을 나타낼 때 멤버변수(field)를 사용 - 파란색으로 표현됨

	int price;
	String ink;
	String company;

//	클래스 안에 기능을 나타낼 때, 메서드를 사용

	void write() {
		System.out.println(ink + " 색상 글씨를 씁니다");
	}

	void info() {
		System.out.println("===펜의 정보===");
		System.out.println("가격:" + price);
		System.out.println("색상:" + ink);
		System.out.println("제조사:" + company);
	}
}
