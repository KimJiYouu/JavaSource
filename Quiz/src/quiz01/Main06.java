package quiz01;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		
		
		char[] arr = str.toCharArray();

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i] - 48;
		}
		System.out.println(sum);

	}
}
