package quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	public static void main(String[] args) {
// 스캐너를 사용하여 id를 입력받음
// 아이디는 공백을 포함해서 받을 수 있음 nextLine()
// 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받음
// 5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료

		Scanner scan = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		String id = scan.nextLine();

		while (true) {
			if (id.replace(" ", "").length() < 5) {
				System.out.println("다시입력하세요");
				id = scan.nextLine();

			} else {
				System.out.println(id.replace(" ", "") + "가 등록되었습니다");
				return;
			}
		}
	}

}
