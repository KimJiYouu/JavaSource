package day04;

import java.util.Arrays;

public class MethodEx06 {
	public static void main(String[] args) {
//		Queue - First In First Out

		push(4);
		push(5);
		push(6);
		System.out.println(Arrays.toString(arr));
		
		pop();
		pop();
		int del = pop();
		System.out.println(del);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] arr = {1,2,3};
	
	static void push(int data) { // 배열 마지막에 int data 추가
		
		int[] temp = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		temp[temp.length - 1] = data;

		arr = temp;
		temp = null; 
	}

	static int pop() {
		
		if(arr.length > 0) {
			int del = arr[0];
			
			int[] temp = new int[arr.length-1];
		
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			
			arr = temp;
			temp = null; 

			return del;
		}
		return 0;
	}
}
