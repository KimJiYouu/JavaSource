package day01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//자바 입력
		//1. scanner 객체 필요
		Scanner scan = new Scanner (System.in); // ctrl + shift + O키
		
		//2. scanner가 가지고 있는 입력기능을 사용해서 데이터를 입력받음
		System.out.print("이름을 입력하세요 : ");
	    String name= scan.next(); // 공백없는 문자열을 받음
	                              // 입력을 받을 수 있는 상태 --> 커셔가 놓인 상태로 입력 대기
	                              // 입력 받은 것을 name이라는 변수에 저장하기
	    
	    System.out.print("나이는? ");
	    int age = scan.nextInt(); // 정수를 받음
	    
	    System.out.print("신장은? ");
	    double height = scan.nextDouble(); // 실수를 받음
	    
	    System.out.println("입력받은 이름 : "+ name + "\n나이 : "+ age + "\n신장 : "+ height);
	    
	    //3. 스캐너 자원해제
	    scan.close();
	}
}
