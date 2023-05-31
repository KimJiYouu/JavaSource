package day10.static_basic;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {


//	Arrays arr = new Arrays(); 객체 생성 불가능하게 접근제한자로 제어시킴
//	String result = Arrays.toString(new int [3]);
//	System.out.println(result);
		

		int[] arr = {1,2,3};
		System.out.println(MyArrays.printArray(arr));
		
		String[]arr2 = {"안녕", "hi","hello"};
		System.out.println(MyArrays.printArray(arr2));
		
		char[]arr3 = {'a','b','c'};
		System.out.println(MyArrays.printArray(arr3));
		
		System.out.println(MyArrays.printArray(new int[3]));
		System.out.println(MyArrays.printArray(new String[3]));
		System.out.println(MyArrays.printArray(new char[3]));
		
		System.out.println(MyArrays2.printArray2(new String[3]));
		
		
//		클래스가 여러번 로드되더라도 static 은 1번만 실행됨
		System.out.println(Init.price);
		System.out.println(Init.s);
		System.out.println(Init.price);
		System.out.println(Init.s);
		
		
	}
	
}
