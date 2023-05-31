package quiz01;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {

		
		 // 1. 7~100까지 정수 중에 7의 배수만 가로로 출력. System.out.println(); // 줄바꿈
		String str = "";
		for (int i = 7; i <= 100; i++) {
			if (i % 7 == 0) {
				str += i + " ";
			}
		}
		System.out.println(str);
		
		for(int i = 7; i <=100; i+=7) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		/* 2. 1~200까지 정수 중에 9의 배수의 개수 출력.*/ System.out.println("----------------");
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수 : "+count);

		/* 3. 50~100 사이 모든 수의 합 */System.out.println("----------------");
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100까지의 합: "+ sum);

		/* 4. A~Z까지 가로로 붙여서 출력, A=65 z=90 */ System.out.println("----------------");
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		
		String strr = "";
		for (char c = 'A'; c <= 'Z'; c++) {
			strr += c;
		}
		System.out.println(strr);
		
		/* 5. 입력받은 정수까지 팩토리얼 */ System.out.println("----------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = scan.nextInt();
		int num2 = 1;
		
		for (int i = 1; i <= num; i++) {
			num2 *= i;
		}
		System.out.println(num+"! = "+num2);
		
		scan.close();
	}
}
