package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21_1 {
	public static void main(String[] args) {
		// 백준 10813 1차원 배열문제
		Scanner scan = new Scanner(System.in);

		System.out.print("배열 길이> ");
		int n = scan.nextInt(); // 배열 길이
		System.out.print("배열자리 교체 횟수> ");
		int m = scan.nextInt(); // 배열자리 바꿀 횟수
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 배열에 초기값 저장
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i <= m; i++) {
			System.out.print("인덱스+1> ");
			int num = scan.nextInt() - 1; //인덱스 번호
			System.out.print("인덱스+1> ");
			int num2 = scan.nextInt() - 1;// 인덱스 번호
			System.out.println("--------------");
			int temp = 0;
			temp = arr[num];
			arr[num] = arr[num2];
			arr[num2] = temp;

		}
		System.out.println(Arrays.toString(arr));
		
		for( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
