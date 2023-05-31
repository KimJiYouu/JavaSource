package day02;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("점수 입력> ");
		int point = scan.nextInt();

		if (point >= 90) {
			// 95점 이상
			if(point >= 95 ) {
				System.out.println("A+학점");
			}else { // 90 <= point <95
			System.out.println("A0학점");
			}
			System.out.println("상위 10%");
			
		} else if (point >=80) /* 90점 이상은 조건1에서 이미 처리됨 */ {
			System.out.println("B학점");
			
		} else if (point >=70) {
			System.out.println("C학점");
			
		} else if (point >=60) {
			System.out.println("D학점");
			
		} else {
			System.out.println("F학점");
		}
		scan.close();
	}
}