package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(method6(arr));

		int[] arr2 = { 1, 2, 3 };
		System.out.println(method7(arr2));

		String[] arr3 = method8("Hello", "Java");
		System.out.println(Arrays.toString(arr3));
	}

	static String method6(char[] arr) { // 배열을 매개변수로 사용할때
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}

	static int method7(int[] arr) { // 배열을 매개변수로 사용할때
		int sum = 0;
		for (int a : arr) { // 향상된 for문
			sum += a;
		}
		return sum;
	}

	static String[] method8(String a, String b) { // 배열을 실행문 안에서 만들어서 반환
		String[] arr = { a, b };
		return arr;
		// return new String[] {a, b};
	}
}
