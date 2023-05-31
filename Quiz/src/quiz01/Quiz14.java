package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		/*
		 * 가로 세로 길이를 입력 가로 세로 길이만큼 사각형 출력 단, 윤곽만 출력
		 *    ********
		 *    *      *
		 *    *      *
		 *    ********
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로길이> ");
		int num = scan.nextInt();  //가로
		System.out.print("세로길이> ");
		int num2 = scan.nextInt(); // 세로

		for (int i = 1; i <= num2; i++) {
			if (i == 1 || i == num2) {
				for (int j = 1; j <= num; j++) {
					System.out.print("*");
				}

			} else {
				System.out.print("*");
				for(int j = 1; j <= num-2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.print("가로길이> ");
		int ga = scan.nextInt(); //가로
		System.out.print("세로길이> ");
		int se = scan.nextInt(); //세로
		
		for(int i = 1; i <= se; i++) {
			for(int j =1; j<=ga ; j++) {
			   if( i == 1 || i == se || j == 1 || j == ga) {
				   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			}
			System.out.println();
		}
		
		
		System.out.print("가로길이> ");
		int w = scan.nextInt();
		System.out.print("세로길이> ");
		int h = scan.nextInt();
		
		for(int i = 1; i<= h; i++) {
			for(int j = 1; j <= w; j++)
			if(i == 1 || i == h) {
				System.out.print("*");
			} else {
				if(j ==1 || j == w) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
	}
}