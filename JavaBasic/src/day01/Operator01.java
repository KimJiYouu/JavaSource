package day01;

public class Operator01 {
	public static void main(String[] args) {

		// 부호연산자 +, -
		int i = -3;
		int j = -i;

		// 증감연산자 ++, --
		int k = 1;
		int h = ++k; // 전위연산 - 먼저 자기자신의 값을 증가시키고, 마지막에 대입
		System.out.println("k는 " + k);
		System.out.println("h는 " + h);

		int x = 1;
		int y = x++; // 후위연산 - 대입을 먼저하고, 자기자신을 증가
		System.out.println("x는 " + x);
		System.out.println("y는 " + y);
		System.out.println(y);

		// 일반적인 표현
		x = 1;
		x++;
		++x;

		x = 1;
		System.out.println("x++는 " + x++);
		System.out.println("++x는 " + ++x);
		System.out.println("x는 " + x);

		System.out.println("----------------");
		int num = 10;
		System.out.println(++num); // 11
		System.out.println(num++); // 11 먼저 대입해서 결과도출시키고 증가시킴
		System.out.println(num++); // 12
		System.out.println(num++); // 13
		System.out.println(num); // 14
		
		System.out.println("-------------");
		
		// ~연산자
		byte b  = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1); // -10 -> 10의 보수
		System.out.println("-------------");
		
		// ! 논리연산자 - 부정의 의미
		boolean bool = !true;
		System.out.println(bool); // false
		System.out.println(!bool); // true
		
	}
}
