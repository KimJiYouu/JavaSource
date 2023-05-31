package quiz01;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int result = 0;
		
		for(int i = 1; i <=n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			result += a*b;
			
		}
		if(result == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
			
		scan.close();
	}
}
