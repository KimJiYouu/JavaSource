package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 키는 실수 나이는 정수
		//키는 140이상, 나이는 8세 이상인 경우만 놀이기구 탑승가능
		// 아니면 놀이기구 탑승 불가
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키> ");
		double height = scan.nextDouble();
		System.out.print("나이> ");
		int age = scan.nextInt();
		
		if (height >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승가능");
			
		}else {
			System.out.println("놀이기구 탑승불가능");
		}
		scan.close();
	}
}
