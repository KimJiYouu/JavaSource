package day03;

import java.util.Arrays;

public class ArrayMatrix {
	public static void main(String[] args) {
		
		// 다차원배열 - 매트릭스
		// 배열 안에 배열이 저장되는 형태
		// int[][] arr = {배열, 배열, 배열...};
		
		int[] kor = {10,20,30};
		int[] math = {40,50,60};
		int[] eng = {70,80,90};
		
		int [][] arr = {kor, math,eng};
		System.out.println(Arrays.toString(arr)); // [[I@58ceff1, [I@7c30a502, [I@49e4cb85]
		System.out.println(Arrays.toString(arr[0])); // [10, 20, 30]
		System.out.println(Arrays.toString(arr[1])); // [40, 50, 60]
		System.out.println(Arrays.toString(arr[2])); // [70, 80, 90]
		
		// 2차원 배열의 사용
		System.out.println(arr[0][0]); // 10
		arr[0][0] = 100;
		System.out.println(arr[0][0]); // 100
		System.out.println(arr[2][2]); // 90
	
		// 2차원 배열을 한번에 생성하고 초기화하는 방법
		int [][] arr2 = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		
		
		// 2차원 배열의 크기만 지정하는 방법
		int [][] arr3 = new int[3][4]; // 3행 4열
		
		// 2차원 배열의 모형을 한번에 보는 방법
		System.out.println(Arrays.deepToString(arr3)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		
		// 2차원 배열의 순회
		int x = 1;
		for(int i = 0; i < arr3.length; i++) { // 0 1 2
			for(int j = 0; j < arr3[i].length; j++ ) { // 0 1 2 3
				arr3 [i][j] = x++; 
			}
		}
		// 결과
		System.out.println(Arrays.deepToString(arr3)); // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	}
}
