package prac;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		String grad;

		if (score >= 90 || score == 100) {
			grad = "A";

		} else if (score >= 80) {
			grad = "B";

		} else if (score >= 70) {
			grad = "C";

		} else if (score >= 60) {
			grad = "D";

		} else {
			grad = "F";
		}
		System.out.println(score % 10 >= 5 || score == 100 ? "+" + grad : grad);

		scan.close();
	}
}
