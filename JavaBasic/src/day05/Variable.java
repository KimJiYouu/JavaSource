package day05;

public class Variable {

//  <멤버변수> - 클래스 밖에서 변경가능
//	int a; 
//	a = 10; 메서드 밖 클래스 안에서는 멤버변수 선언만 가능

	int a = 1; // 선언과 동시에 초기화는 가능
	int b;
	String bb;

	void printNum(int d) {
		int c = 1; // 지역변수는 반드시 초기화해주어야 함. 클래스 밖에서 변경 불가능

		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("멤버변수: " + bb);
		System.out.println("지역변수: " + c);
		System.out.println("지역변수(매개변수): " + d);
	}
}
