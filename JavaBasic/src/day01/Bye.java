package day01;

public class Bye {

	public static void main(String[] args) { 

		//main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다.
		//sysout 이라 적도 ctrl + space 출력문 자동완성
		/*
		 * ctrl + s : 저장
		 * ctrl + f11 : 실행
		 * ctrl + d : 한줄 삭제
		 * ctrl + +/- : 화면확대/축소
		 * ctrl + shift + f : 들여쓰기
		 * alt + 방향키 : 코드이동
		 * alt + ctrl + 방향키 : 코드복사
		 * ctrl + z : 되돌리기
		 * ctrl + a, ctrl + i : 전체선택 후 정렬
		 * ctrl + / : 행 주석
		 */
		System.out.println("출력문 자동완성");
		System.out.println(1);
		System.out.println("1");
		
		//자바의 출력문의 종류 
		//개행문자 \n -> enter의 의미
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("\nhi\nbye\n");
		
		//개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		
		//형식 지정 출력문 printf
		//내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음
		 * %f - 실수를 대입할 수 있음
		 * %s - 문자열을 대입할 수 있음
		 * 
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬
		 */
		
		System.out.printf("제 이름은 %s입니다.\n", "홍길동");
		System.out.printf("원주율은 %.2f입니다.\n", 3.14); // %.숫자f면 소숫점 아래 숫자만큼만 표현됨
		System.out.printf("오늘은 %d일 입니다.\n", 7);
		System.out.printf("\t제 생일은 %d년 %d월 %d일입니다.\n", 1995, 12, 25);
		 

	}

}
