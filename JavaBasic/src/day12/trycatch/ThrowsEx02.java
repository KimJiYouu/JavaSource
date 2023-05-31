package day12.trycatch;

public class ThrowsEx02 {

	public ThrowsEx02() throws Exception { // throws 3번
		System.out.println("생성자시작");
		aaa(); // 프로그램 종료되고 아래 실행문은 실행 안됨
		System.out.println("생성자종료");
	}

	public void aaa() throws Exception { // throws 2번
		System.out.println("aaa시작");
		bbb(); // 프로그램 종료되고 아래 실행문은 실행 안됨
		System.out.println("aaa종료");
	}

	public void bbb() throws Exception { // throws 1번
		System.out.println("bbb시작");

		System.out.println(10 / 0); // 오류가 난 부분에서 프로그램 종료됨

		System.out.println("bbb종료");
	}

//	 main
	public static void main(String[] args) {

		try {
			ThrowsEx02 ex = new ThrowsEx02();

		} catch (Exception e) {

			System.out.println("예외처리 끝");
		}
	}
}
