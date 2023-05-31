package day05;

public class Phone {

	String model;
	String color;
	int price;

//	생성자는 멤버변수 바로 아래에 생성
//	생성자는 반환유형이 없음
//	멤버변수를 초기화하는 용도로 보통 사용됨
//	생성자를 직접 생성하게 되면, JVM이 기본생성자를 자동생성하지 않음.
//  웬만하면 기본 생성자를 직접 작성하여 JVM이 자동으로 생성함으로써 발생하는 오류를 피함	
	Phone() { // 기본 생성자
		System.out.println("생성자 호출!");
		model = "갤럭시";
		color = "검정색";
		price = 100000;
	}

//	매개변수의 종류나 개수가 달라야 생성자 여러개 선언가능
	Phone(String a) {
		model = a;
		color = "pink";
		price = 200000;
	}

	Phone(String a, String b) { // model, color
		model = a;
		color = b;
		price = 300000;
	}

	Phone(String a, int b) { // model, price
		model = a;
		color = "White";
		price = b;
	}

	Phone(String a, String b, int c) { // model, color, price
		model = a;
		color = b;
		price = c;
	}

	void info() {
		System.out.println("===폰의 정보===");
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price + "원");
	}
}
