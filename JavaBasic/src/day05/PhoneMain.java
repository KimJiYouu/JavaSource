package day05;

public class PhoneMain {
	public static void main(String[] args) {

		new Phone(); // 생성자 호출

		Phone black = new Phone();
		black.info();

		Phone pink = new Phone("아이폰14");
		pink.info();

		Phone blue = new Phone("TTL", "빨간색");
		blue.info();

		Phone white = new Phone("가로본능", 400000);
		white.info();

		// model, color, price를 매개변수로 받아서 초기화하는 생성자 만들기
		Phone yellow = new Phone("Galaxy", "노란색", 500000);
		yellow.info();
	}
}
