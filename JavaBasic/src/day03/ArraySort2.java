package day03;

import java.util.Arrays;

public class ArraySort2 {
	public static void main(String[] args) {

		// 버블정렬 - 가장 느린 정렬 (큰 값을 뒤로 보낸다)
		// 옆에 있는 값과 맞물리게 비교해서 큰값을 뒤로 보냄
		int[] arr = { 5, 23, 1, 43, 200, 100, 40 };
		// 5 1 23 43 100 40 200 1회전
		// 1 5 23 43 40 100 200 2회전 마지막 자리는 비교x
		// 1 5 23 40 43 100 200 3회전 마지막 두자리는 비교x - 정렬완성

		// 바깥반복문은 회전수
		// 안쪽반복문은 회전수 6>5>4>3>2>1
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("회전값 : " + i);
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.println(i + "-" + j);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));

		}
		// 아주 유용한 기능
		Arrays.sort(arr); // 가장 빠른 퀵정렬
		System.out.println(Arrays.toString(arr));
	}
}