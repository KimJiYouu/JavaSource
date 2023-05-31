package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		누적시킬 변수는 반복문 밖에 생성
		int i = 0;
		int j = 0;

		while (true) {
//			랜덤한 값이 반복해서 출력되기 위해 Math.random()을 while문 안에 작성
			int num = (int) (Math.random() * 100) + 1;
			int num2 = (int) (Math.random() * 100) + 1;
			int num3 = (int) (Math.random() * 4);

			int result = 0;

			if (num3 == 0) {
				System.out.println(num + " + " + num2 + " = ?");
				result = num + num2;

			} else if (num3 == 1) {
				System.out.println(num + " - " + num2 + " = ?");
				result = num - num2;
			} else if (num3 == 2) {
				System.out.println(num + " x " + num2 + " = ?");
				result = num * num2;
			} else {
				System.out.println(num + " / " + num2 + " = ?");
				result = num / num2;
			}
			System.out.print("[문제를 그만 푸시려면 0을 입력하세요.]\n답> ");
			int answer = scan.nextInt();

			if (answer == 0) {
				System.out.println("\n프로그램 정상 종료");
				System.out.println("정답: " + i);
				System.out.println("오답: " + j);
				break;

			} else if (answer == result) {
				System.out.println("정답입니다");
				i++;

			} else {
				System.out.println("틀렸는데요?");
				j++;
			}
			System.out.println("------------------------");
		}
	}
}
