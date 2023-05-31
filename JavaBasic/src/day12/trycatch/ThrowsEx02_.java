package day12.trycatch;

public class ThrowsEx02_ {

	public ThrowsEx02_() {
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자종료");
	}

	public void aaa() {
		System.out.println("aaa시작");
		bbb();
		System.out.println("aaa종료");
	}

	public void bbb() {
		System.out.println("bbb시작");

		try {
			System.out.println(10 / 0);

		} catch (Exception e) {
			System.out.println("예외처리 끝");
		}

		System.out.println("bbb종료");
	}

	// main
	public static void main(String[] args) {
		ThrowsEx02_ ex = new ThrowsEx02_();
	}
}
