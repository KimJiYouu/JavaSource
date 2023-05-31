package day10.static_basic;

public class MyArrays2 {

	private MyArrays2() {

	}

	public static String printArray2(String[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i == arr.length - 1) {
				return str += "]";
			}
			str += ", ";
		}
		return str;
	}
}
