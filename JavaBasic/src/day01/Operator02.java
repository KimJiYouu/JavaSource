package day01;

public class Operator02 {
	public static void main(String[] args) {
		
		// 2항 연산자
		int i = 7/3; // 2
		int j = 7%3; // 1
		int k = 7*3; // 21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//비교연산 < > <= ==
		System.out.println(i == j);
		System.out.println(i >= j);
		System.out.println(i < j);
		System.out.println(i != j);
		System.out.println(21 != k);
		System.out.println(k % 2 != 0); // 홀수 
		System.out.println(k % 2 == 1); // 홀수
		
		//비트 연산자
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); // 0000 0001
		System.out.println(a | b); // 0000 0111
		System.out.println(a ^ b); // 0000 0110
		
		//비트 shift
		int h = 100; //0110 0100
		System.out.println(h << 3); 
		System.out.println(h >> 3);
	}
}
