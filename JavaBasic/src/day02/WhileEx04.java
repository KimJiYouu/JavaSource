package day02;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		
		/*
		 * 입력을 받을 횟수 지정
		 * 예) 처음 5를 입력받으면 
		 * 추가적으로 5번 입력받을 수 있도록 처리 반복문 안에서도 입력받을 수 있음
		 * 입력받은 값들의 합
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반복수: ");
		int size = scan.nextInt();
		
		int a = 1;
		int sum = 0;
		
		while(a <= size) {
			
			System.out.print("입력> ");
			int x = scan.nextInt();
			sum += x;
			a++;
		}
		System.out.println("입력받은 수의 합계 : "+sum);
		scan.close();
	}
}
