package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		/*
		 * 어떤 정수를 입력 받음
		 * 입력받은 정수에 해당하는 구구단 세로로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<정수를 입력하세요>");
		int i = scan.nextInt();
		System.out.println("구구단 : "+ i + "단");
		
		int j = 1;
		while (j <= 9) {
			System.out.println(i + " x "+j+" = "+(i * j));
			j++;
		}
		scan.close();
	}
}
