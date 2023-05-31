package quiz17;

import java.util.Scanner;

public class Calculator {
	
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		try {
			System.out.println(c.input());
			
		} catch (Exception e) {
			String m = e.getMessage();
			System.out.println(m);
		}
	} // 메인메서드 종료
	
	
//		1. scanner로 정수 두개를 입력을 받아서 두 수의 합을 반환하는 기능
//		2. 입력된 값이 정수라면 합계를 반환
//		3. 예외가 발생하면 직접 예외를 생성하고 예외 메세지를 외부로 전달하기
//		4. scan.close() 은 finally 에서 처리
	
	public int input() throws Exception {
			
		try {
			System.out.print("입력> ");
			int num = scan.nextInt();
			System.out.print("입력> ");
			int num2 = scan.nextInt();
			
			return num + num2;
			
		} catch (Exception e) { // 예외가 발생하면 가장 가까운 catch문으로 이동됨

			throw new Exception("정수가 아님"); //예외생성
		
		} finally {
			scan.close();
		}
	}
}
