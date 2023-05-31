package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		// 1. 두 정수를 입력받고, 큰 수 출력하기
		// 단, 같은 수라면 "같은 수입니다" 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수> ");
		int a = scan.nextInt();
		System.out.print("두번째 정수> ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(a);
		}else if (a < b) {
			System.out.println(b);
		}else {
			System.out.println("같은 수입니다");
		}
		scan.close();
	}

}
