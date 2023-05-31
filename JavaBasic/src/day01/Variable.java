package day01;

public class Variable {
	public static void main(String[] args) {
		
		/*
		 * 변수의 선언방법
		 * <데이터 타입> 이름;
		 * int 는 Integer 의 약자로 정수를 저장하는 타입
		 */
		
		int num; //선언
		num = 10; //초기화
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20;
		
		//같은 이름으로 변수를 생성할 수 없음
        //int num2 = 30; (X)
		
		//언제든지 값을 바꿀 수 있음
		num2 = 40;
		System.out.println(num2); //40
		num2 = 50;
		System.out.println(num2); //50
		
		//변수에는 다른 변수의 값, 또는 연산한 결과도 저장할 수 있다
		int result = num + num2;
		result = num;

		//문자열을 저장 : String에 저장 String은 클래스이기 때문에 대문자로 시작
		String s = "홍길동";
		
		//?
		int result2 = num + 20;
		result2 = 100;
		result2 = 10 + result2;
		
		System.out.println(result2);
		
		
		
		
	}

}
