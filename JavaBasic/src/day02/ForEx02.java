package day02;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		// 입력받은 정수가 소수인지 For문으로 판별
		// 소수의 특징은 약수의 개수가 2개
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = scan.nextInt();
		int count = 0; //카운트변수
		
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) { //약수
				System.out.print(i+" ");
				count++; //약수 개수세기
			}
		}
		System.out.println();
		System.out.println(count == 2 ? num+"은 소수":  num+"은 소수가 아님");
		scan.close();
	}
}
