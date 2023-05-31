package quiz01;

import java.util.Scanner;

public class Quiz20_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] arr = new int[num];
		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
			
			if (max < arr[i]) {
				max = arr[i];
			}
				if (min > arr[i]) {
					min = arr[i];
				}
		}
		System.out.println(max + " " + min);
	}

}
