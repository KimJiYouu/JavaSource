package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		// 백준

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(); // 배열의 길이

		int[] arr = new int[num]; // 배열 생성

		for(int i = 0; i < num; i++) {
			int a = scan.nextInt(); // 배열 값 지정
			arr[i] = a;
		}
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {

			if (max < arr[j]) {
				max = arr[j];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.println("max는 "+max);
		System.out.println("min은 "+min);

	}
}
