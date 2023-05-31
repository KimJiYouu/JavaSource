package day04;

public class MethodEx02 {
	public static void main(String[] args) {
		
//		매개변수(parameter)
//		메서드가 전달받는 매개값
//		여개를 받을 수도 있고 받지 않을 수도 있음
		
//		calSum(값)
		int result = calSum(10);
		System.out.println("결과: "+result);
		
		result = calSum(100);
		System.out.println("결과: "+result);
		
		result = calSum2(10,20);
		System.out.println("결과: "+result);
		
		String result2 = calSum3(7, "가");
		System.out.println("결과: "+result2);
		
	} // main 메소드 끝
	
//	 <매개변수와 반환값이 모두 존재하는 유형>
	
	//1~매개변수까지의 합계
	static int calSum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	//매개변수를 2개 받음
	static int calSum2(int a, int b) {
		
//		int result = a + b;
//		return result;
		return a+b; // 메서드 타입과 return 타입을 맞춰서 작성
	}

	//정수, 문자열을 전달받는 String calSum3() 생성
	static String calSum3(int a, String b) {
		String str = "";
		for(int i = 1; i <= a; i++) {
			str += b;
		}
		return str;
	}
}
