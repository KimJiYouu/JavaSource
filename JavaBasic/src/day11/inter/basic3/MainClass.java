package day11.inter.basic3;

public class MainClass {
	public static void main(String[] args) {

// LG객체 생성해서 interface 타입으로 설정
// interface를 main 클래스와 LG클래스 사이의 매개체로 사용
		Printed pt = new LG();
		pt.print("Hello World");
		pt.colorPrint("Hello World", "Blue");
		int result = pt.copy(5);
		System.out.println(result);

		System.out.println("===================");
// interface를 안거치고 바로 Samsung class 연결
		Samsung sa = new Samsung();
		sa.print("Hello Java");
		sa.colorPrint("Hello Java", "Red");
		int result2 = sa.copy(5);
	}
}
