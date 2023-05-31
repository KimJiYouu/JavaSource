package quiz08;

public class Cart { // 부모 클래스

	String[] cart = new String[1]; // 멤버변수로 만들어진 배열
	int money; // 금액
	int i = 0; // cart의 순서
	
	int tv;
	int com;
	int radio;
	
	void buy(String product) {
		System.out.println("재정의 하세요");
	}
	void add(String product) {
		System.out.println("재정의 하세요");
	}
	void info() {
		System.out.println("재정의 하세요");
	}
	
}
