package day06.str_ex;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("==============");

		System.out.println(str1 == str2);
		// 같은 파일에서 선언한 홍길동은 같은 객체를 참조함

		System.out.println(str1 == str3);
		// 직접 생성명령을 내리거나 다른 클래스에서 넘어온 String은 다른 주소를 나타내게 됨
		// 문자열 동등비교시에는 == 대신 equals()메서드를 사용해서 비교

		if (str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		// null safety (널 안정성)이 없어서 에러발생 가능
		if (str1 != null && str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
	}
}
