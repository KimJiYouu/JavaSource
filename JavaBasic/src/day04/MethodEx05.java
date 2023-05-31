package day04;

import java.util.Arrays;

public class MethodEx05 {
	public static void main(String[] args) {
//		배열의 한계점 -> 크기가 정적
//		Stack - Last In First Out (LIFO)

		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));

		pop();
		pop();
		int del = pop(); // 삭제된 데이터도 확인이 가능함
		System.out.println("삭제된 데이터: " + del);
		System.out.println(Arrays.toString(arr));
	}

	static int[] arr = { 1, 2, 3 };

//	push -> 특정요소를 마지막에 추가
	static void push(int data) { // 배열 마지막에 int data 추가

		// 1. 배열의 크기를 +1한다 -> 배열의 크기를 +1한 새로운 배열을 만듦
		int[] temp = new int[arr.length + 1];

		// 2. arr 배열의 요소를 깊은 복사
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		// 3. 마지막에 추가
		temp[temp.length - 1] = data;

		// 4. 원본 배열을 temp로 변경
		arr = temp;
		temp = null; // temp는 지움
	}

//	pop -> 특정 요소를 마지막에서 삭제(반환 - 삭제된 데이터)
//	0보다 클 때까지만 
	static int pop() {

		if (arr.length > 0) {
			// 1. 삭제할 마지막 데이터를 백업
			int del = arr[arr.length - 1];

			// 2. arr 보다 -1인 사본 배열을 생성
			int[] temp = new int[arr.length - 1];

			// 3. 맨 마지막 데이터를 제외하고 원본배열을 사본으로 복사
			for (int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			// 4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null; // temp 삭제

			return del;
		}
		return 0;
	}

}
