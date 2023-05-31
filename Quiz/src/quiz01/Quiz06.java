package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {

		/*
		 * if구문 밖에 선언된 변수를 활용 정수 3개를 입력받음 가장 큰 값, 중간 값, 작은 값을 구분해서 출력. (조건 - 같은 수는 없다)
		 * 입력 15 30 7 출력 max 30 mid 15 min 7
		 * 
		 */
		int max = 0;
		int mid = 0;
		int min = 0;

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a > b && a > c) {
			max = a;
			if (b > c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
		} else if (b > a && b > c) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}

		} else {
			max = c;
			if (b > a) {
				mid = b;
				min = a;
			} else {
				mid = a;
				min = b;
			}
		}
		System.out.println("max : "+max);
		System.out.println("mid : "+mid);
		System.out.println("min : "+min);
	}
}
