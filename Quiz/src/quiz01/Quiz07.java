package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1> ");
		int a = scan.nextInt();
		System.out.print("연산(+, -, *, /)> ");
		String oper = scan.next();
		System.out.print("정수2> ");
		int b = scan.nextInt();
		
		switch (oper) {
		case "+": 
			System.out.println("두 수의 덧셈은:" + (a+b));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은: " + (a-b));
		   	break;
		case "*" :
			System.out.println("두 수의 곱셈은: "+ (a*b));
			break;
		case "/" :
			System.out.println("두 수의 나눗셈은: "+ (a/b));
		default :
			System.out.println("연산자는 [+, -, *, /]입니다");
		}
	}
}
