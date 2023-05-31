package day12.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		
//		//next, nextInt, nextDouble, nextLine
//		
//		System.out.print("정수> ");
//		int num = scan.nextInt(); // 정수입력 후 엔터 값까지 입력되지만 엔터 전까지만 받음
//		
//		scan.nextLine(); // 엔터를 소비
//		
//		System.out.print("문자열> ");
//		String info = scan.nextLine(); // 문자열입력전에 엔터가 남아있기 때문에 엔터 포함해서 받게 됨
//		
//		System.out.println(num);
//		System.out.println(info);

		while (true) {
			try {
				System.out.print(">");
				int num = scan.nextInt(); // 문자+엔터값 을 정상적으로 처리를 못해서
											// 문자+엔터값이 반복문 안에 남아있어서 무한루프
				System.out.println(num);

			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
				scan.nextLine(); // 문자+엔터값을 대신 처리해줌
			}
		}
	}
}
