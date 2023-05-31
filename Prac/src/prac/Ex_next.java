package prac;

import java.util.Scanner;

public class Ex_next {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		System.out.println("nextInt: "+num);

		int num2 = scan.nextInt();
		System.out.println("nextInt: "+num2);

		scan.nextLine();
		
		String num3 = scan.nextLine();
		System.out.println("nextLine: "+num3);
		
		String s = scan.next();
		System.out.println("next: " + s);


		scan.nextLine();

		String ss = scan.nextLine();
		System.out.println("nextLine: " + ss);

		String sss = scan.nextLine();
		System.out.println("nextLine: " + sss);

	}
}
