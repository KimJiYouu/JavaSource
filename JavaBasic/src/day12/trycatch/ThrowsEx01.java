package day12.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
//		메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws이다.
//		throws 구문이 붙어있는 생성자 or 메서드는 예외처리를 대신 진행해야 한다.
		
		try {
			greeting(10);
		} catch (Exception e) {
			System.out.println("에러가 발생");
			
			e.printStackTrace(); // 에러가 발생했을 때 에러로그를 확인하기 위해 많이 사용함
			                     // 프로그램이 종료되는 것이 아니고 에러난 부분을 출력해주는 것뿐
		}
		
//		throws의 예시 //////////////////////////
//		해당 클래스의 메서드에 throws가 붙어있는 경우 반드시 try/catch 구문으로 처리
		
		try {
			Class.forName("@#$%$%"); // surround with try/catch 선택
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			new FileInputStream("#$%");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		//////////////////////////////////////
		
		System.out.println("프로그램 정상종료");

	}  // main메서드 종료

	private static String[]arr = {"hello", "bye", "say good bye"};
	
	public static void greeting(int index) throws Exception{
		System.out.println(arr[index]);
	}
}
