package day02;

public class DoWhileEx01 {
	public static void main(String[] args) {
		
		/* do ~ while문은 조건이 false여도 무조건 1번 실행
		 * 2번째부터는 while몬과 완전히 동일
		 */
		int a = 1;
		
		do {
			System.out.println(a);
			a++;
		} while ( a <= 0);
		
	}

}
