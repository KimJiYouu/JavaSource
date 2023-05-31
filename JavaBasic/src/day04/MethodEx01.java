package day04;

public class MethodEx01 {
//	메소드는 생성과 호출이 있음.
//	메소드는 메소드 안에서 생성할 수 없음.
//  모든 문법 사용가능
	public static void main(String[] args) { // main 메소드



		System.out.println("1~10까지의 합: " + calSum());
		int result = calSum(); // 변수 선언한 곳에 대입하여 사용가능
		System.out.println("1~10까지의 합: " + result);

		String result2 = calSum2();
		System.out.println("A~Z문자열 합: " + result2);

	} // main 메소드 끝나는 지점

//       <반환은 있고 매개변수는 없는 유형>
           
//	  일단은 static 붙여주기 + 반환유형 이름()
	    static int calSum() {

		// 1~10까지 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum; // 합계를 반환
	}

	// 문자열 반환
	static String calSum2() {

		// A ~Z문자열 합
		String str = "";
		for (char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
	}
}
