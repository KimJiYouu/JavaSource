package quiz01;

import java.util.Arrays;

public class Quiz21 {
	public static void main(String[] args) {

//		1~9까지 숫자 중 절대 중복되지 않는 숫자를 추출
//		array를 랜덤하게 10번 섞어줌
//		0~2번째 값을 새로운 배열로 옮겨 담음.

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 9); //인덱스 값이므로 0~8
			int b = (int) (Math.random() * 9);// 0~8
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
//		int [] arr2 = {arr[0],arr[1],arr[2]};
//		System.out.println(Arrays.toString(arr2));
		
		int [] newArr = new int[3];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
