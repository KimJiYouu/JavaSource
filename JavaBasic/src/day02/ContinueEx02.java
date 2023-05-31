package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {

		/*
		 * 1. 입력받은 수까지 소수들의 합 입력 7 -> 바깥 반복문은 7까지 회전
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		int sum = 0;
		x: for (int i = 1; i <= num; i++) {
			count = 0; 
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
				if (count > 2)
					continue x;
			}
			if (count == 2) {
				sum += i;
			}
		}
		System.out.println("소수들의 합 : " + sum);
	}

}
