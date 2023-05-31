package quiz01;

import java.util.Scanner;

public class Quiz17_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;

		while (true) {
			int num1 = (int) (Math.random() * 100) + 1;
			int num2 = (int) (Math.random() * 100) + 1;
			int oper = (int) (Math.random() * 2) + 1;

			System.out.println("------------------");
			System.out.println(num1 + (oper == 0 ? " + " : " - ") + num2 + " = ?");
			System.out.print("[문제를 그만 푸시려면 0을 입력하세요]\n> ");
			
			int answer = scan.nextInt();
			int correct = oper == 0 ? num1 + num2 : num1 - num2;

			if (answer == 0) {
				System.out.println("정답횟수: " + i);
				System.out.println("오답횟수: " + j);
				break;

			} else if (answer == correct) {
				System.out.println("정답");
				i++;
			} else {
				System.out.println("오답");
				j++;
			}

		}

	}

}
