package quiz18;

import java.util.Scanner;

public class StringQuiz02 {
// 주민번호 검증 메서드 masking(String)
// 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
// 050101-******* 로 마스킹 처리하여 리턴하는 static 메서드를 만들어주세요
// 
// 조건
// 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다
// 2. 13자리가 아니거나, 남, 여가 아니라면 throws 처리
// 3. 주민번호는 - 를 포함해서 받을 수 있습니다
// 4. 남, 여에 대한 정보를 출력해줍니다
// 
// masking 메서드를 만들어주세요
// 검증데어터 951225-1000000 -> 남자
// 검증데이터 9512252000000 -> 여자
// 검증데이터 9512253000000 -> 예외

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			String ssn = scan.next();

			try {
				System.out.println(masking(ssn));
				return;

			} catch (Exception e) {
				String msg = e.getMessage();
				System.out.println(msg);
				scan.nextLine();
			}
		}
	}

	public static String masking(String a) throws Exception {

		String k = a.replace("-", "");
		if (k.length() != 13) {
			throw new Exception("13자리가 아님");
		}

		char h = k.charAt(6);
		if (h == '1') {
			System.out.println("남자");
		} else if (h == '2') {
			System.out.println("여자");
		} else {
			throw new Exception("외계인");
		}

		return k.substring(0, 6) + "-" + "*".repeat(7);
	}
}
