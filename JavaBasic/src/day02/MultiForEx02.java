package day02;

public class MultiForEx02 {
	public static void main(String[] args) {

		// 회전수가 변경되는 중첩반복문
		// i값에 따라서 j의 값을 변경
		// 1-1
		// 2-1
		// 2-2

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);
			}
		}
		System.out.println("----------------");

		// 별 출력하기
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */
		// 바깥 for문은 행
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 행입력이 다 끝났을때(안쪽 반복문 끝난 후에) 줄 바꿈
		}

		/*
		 * ####* 1행 
		 * ###*** 2행 
		 * ##***** 3행 
		 * #******* 4행 
		 * ********* 5행
		 */

		int star = 5;

		for (int i = 1; i <= star; i++) {
			// 공백설정
			for (int j = 1; j <= (star - i); j++) {
				System.out.print(" ");
			}
			// 별출력
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
