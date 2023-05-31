package day02;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {

		// 1~100까지 수 중에서 짝수의 합

		int a = 1;
		int sum = 0;

		while (a <= 100) {

			if (a % 2 == 0) {

				sum += a;
			}
			a++;
		}
		System.out.println("1~100 짝수의 합 : " + sum);

		System.out.println("--------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력>");
		int num = scan.nextInt();

		int i = 1;
		int sum2 = 0;
		while (i <= num) { // num번째까지 반복

			if (i % 2 == 0) {
				sum2 += i; // i가 짝수일 가정에서만 sum이 되는 것이므로 if문 안에서 연산
			}
			i++;
		}
		System.out.println("1부터 " + num + "까지의 짝수의 합: " + sum2);
		scan.close();
	}
}
