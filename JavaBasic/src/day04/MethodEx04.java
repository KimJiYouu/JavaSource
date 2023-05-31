package day04;

import java.util.Arrays;

public class MethodEx04 {
	public static void main(String[] args) {

//		배열을 매개변수로 전달할 수 있음
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		method01(arr); // 변수명으로 입력

//		배열을 반환유형으로 전달받을 수 있음
		int[] result = method02();
		System.out.println(Arrays.toString(result));
	}

	static void method01(char[] name) {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

	static int[] method02() {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		return arr;
	}
}
