package day03;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		// 배열정렬 
		// 선택정렬

		int[] arr = {5,23,1,43,200,100,40};
		// 1 23 5 43 200 100 40 - 1회전
		// 1 5 23 43 200 100 40 - 2회전
		// 1 5 23 43 200 100 40 - 3회전
		// 1 5 23 40 200 100 43 - 4회전
		// 1 5 23 40 43  200 100 - 5회전
		// 1 5 23 40 43  100 200 - 6회전

		//바깥 반복문은 회전수
		//안쪽 반복문은 비교할 값

		for(int i = 0; i < arr.length-1; i++) { //배열의 마지막 인덱스까지 회전할 필요없음 0~5까지

			for(int j = i+1; j < arr.length;j++) { // i+1~ 끝까지
				 System.out.print(i+"-"+j+"/");

				if(arr[i]>arr[j]) { // 비교대상이 작다면 swap

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}System.out.println();
		} 
		System.out.println(Arrays.toString(arr));

	}
}
