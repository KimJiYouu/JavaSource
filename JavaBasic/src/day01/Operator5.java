package day01;

public class Operator5 {
	public static void main(String[] args) {
		
		//프로그램에서 램던한 값을 발생시키는 기능
		System.out.println( Math.random() );  // 1미만의 random한 double 값
		
		// 1~10까지 랜덤한 값
		 double d = Math.random() * 10; // 0이상 10미만의 double 값
		 int a = (int)d + 1; // 0~9까지의 정수 + 1 == 1~10 사이의 랜덤한 정수
		 System.out.println("1~10까지 랜덤한 수 : "+ a);
		 
		 // 한번에 적기
		 int result_ = (int)Math.random() * 10 +1;
         // (int)Math.random() -> 0  먼저 계산됨
		 
		 int result = (int)(Math.random()*10) + 1;
		 System.out.println(result_);
		 System.out.println(result);
		 
		 //삼항연산식
		 // 조건 ? 연산1 : 연산2
		 
		 String s = result % 2 ==0? "짝수" : "홀수";
		 
		 System.out.println(result + "는 " + s);
	}
}
