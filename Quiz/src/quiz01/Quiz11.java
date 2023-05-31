package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력받음 입력받은 수의 약수의 합
		 * 
		 * 예시 입력수 10 출력 1+2+5+10 = 18
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;
		String str = "";
		
		while (i <= num) {
			if (num % i == 0) {
				sum += i;
				str += i + " ";
			}
			i++;
		}
		System.out.println(str);
		System.out.println("약수의 합: " + sum);
		scan.close();
	}

}
