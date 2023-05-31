package day07.overload;

public class Basic {
/*
* 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것
* 
*1. 이름은 똑같음 
*2. 매개변수를 다르게 설정하여 모형을 다르게 해야함 
*3. 반환유형은 오버로딩에 영향을 미치지 않음. 
*     - 반환이 다르더라도 같은 메서드로 간주됨
*/

	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
//	int input(int x) {
//		return 0;  
// 매개변수는 같은데 반환유형이 달라도 오버로딩 불가능
//	}

	void input(String a) {
		System.out.println("문자열 1개 입력받음");
	}

	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력받음");
	}

	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력받음");
	}

	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}

}
