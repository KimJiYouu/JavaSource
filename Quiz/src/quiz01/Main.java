package quiz01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			String s = scan.next();
			char k = s.charAt(0);
			char j = s.charAt(s.length()-1);
			System.out.print(k);
			System.out.println(j);
			
			System.out.println(""+k+j);
		}
	}
}
