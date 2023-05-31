package day05;

public class PenMain {
	public static void main(String[] args) {

//		펜을 사용하려면 객체로 생성해야 함
		Pen red = new Pen();

		red.ink = "빨간색";
		red.price = 2000;
		red.company = "빨간펜";

		red.write();
		red.info();
		System.out.println();

		Pen black = new Pen();

		black.ink = "검정색";
		black.company = "모나미";
		black.price = 1000;

		black.write();
		black.info();
	}
}
