package day02;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		// switch문장과 if else문이 유사
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		int point = scan.nextInt();
		
		//switch 소괄호 안에 변수의 연산식이 들어갈 수 있음
		switch (point/10) {
		case 9:
			if (point>=95) {System.out.println("A+학점");
			
			}else {
				System.out.println("A0학점");
			}
			System.out.println("상위 10%");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("재수강");
			break;
		}
	}
}
