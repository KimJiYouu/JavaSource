package quiz01;

public class MethodQuiz01 {
	public static void main(String[] args) {

		method1();
		System.out.println("전달받은 매개변수: " + method2("잘가"));
		System.out.println("세 매개변수 합: " + method3(1, 2, 3.8));
		System.out.println("짝홀 판단: " + method4(5));
		method5("a", 6);
		System.out.println("더 큰 수 판단: " + maxNum(45, 100));
		System.out.println("절댓값: " + abs(-7));
		System.out.println(java(5));

	}

	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String s) {
		return s;
	}

	static double method3(int a, int b, double c) {
		return a + b + c;
	}

	static String method4(int a) {
//		if (a % 2 == 0) { // 특정 조건하에 return을 여러개 사용가능
//			return "짝수";
//		} else {
//			return "홀수";
//		}

		return a % 2 == 0 ? "짝수" : "홀수";
	}

	static void method5(String s, int a) {
		String str = "";
		for (int i = 1; i <= a; i++) {
			str += s;
		}
		System.out.println(str);
	}

	static int maxNum(int a, int b) {
//		if (a >= b) {
//			return a;
//		} else {
//			return b;
//		}
		return a >= b ? a : b;
	}

	static int abs(int a) {
//		if (a < 0) {
//			return -a;
//		} else {
//			return a;
//		}
		return a < 0? -a : a;
	
	}
	
	static String java(int a) {
		String s = "";
		for(int i = 1; i <= a; i++) {
				if(i%2 == 1) {
					s += "자";
				} else {
					s += "바";
				}
		}
		return s;
	}
}
