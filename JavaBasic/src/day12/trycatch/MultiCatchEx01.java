package day12.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {
		
//		참고
//		메인메서드도 매개변수를 받을 수 있음
//		run > run configuration > argument 탭 > ${string_promp} 

		try {
			String a1 = args[0];
			String a2 = args[1];
			
			/*String으로 전달받은 숫자를 정수로 변경하는 메서드*/
			int num1 = Integer.parseInt(a1);
			int num2 = Integer.parseInt(a2);
			System.out.println("두 수의 합: "+(num1+num2));
			
			String str = null;
			str.charAt(0);
			
		  /*catch문에는 에러를 처리할 정확한 에러 클래스가 선언됨*/
		  /*Exception은 모든 예외클래스 부모클래스입니다. (모든 예외처리 가능)*/
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남 매개 변수를 2개 입력하세요");
			
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
			
		} catch(Exception e) { // ctrl + t 예외의 상속관계 확인 가능
			System.out.println("기타 예외입니다");
		}
	}
}
