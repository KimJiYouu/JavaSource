package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int arr[] = { 10, 20, 30, 40, 50 };
		int newArr[] = new int[arr.length + 1];

		int data = 100; // 중간에 추가할 값
		
		System.out.print("targetIndex: ");
		int targetIndex = scan.nextInt(); // 추가할 위치

		// 배열의 길이가 6인 배열을 새로 만들고(newArr 생성) 원래 배열을 그대로 복사해옴 [10,20,30,40,50,0]
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println("단계 1: newArr = " + Arrays.toString(newArr));

		// 그리고 30부터 index를 하나씩 뒤로 밀고 targetIndex 값에 100 추가 [10,20,100,30,40,50]
		// 배열의 추가할 인덱스 ~ 마지막-1까지 옮겨 담는 작업

//		<잘못된 방법>
//		for(int i = targetIndex; i < newArr.length-1; i++) {
//			newArr[i+1] = newArr[i];
//		}
//		System.out.println(Arrays.toString(newArr)); // [10, 20, 30, 30, 30, 30] --> 잘못된 방법

//		<올바른 방법>
		for (int i = newArr.length - 2; i >= targetIndex; i--) {
			newArr[i + 1] = newArr[i];
		}
//		<같은 조건>
//		for (int i = newArr.length - 1; i > targetIndex; i--) {
//			newArr[i] = newArr[i - 1];
//		}

		System.out.println("단계 2: newArr = " + Arrays.toString(newArr));

//		<targetIndex 값 변경>
		newArr[targetIndex] = data;

//		arr을 newArr로 변경
		arr = newArr;
		newArr = null; // 완전삭제

		System.out.println("단계 3: arr = " + Arrays.toString(arr));
		System.out.println("단계 4: newArr = " + Arrays.toString(newArr));
	}
}
