package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch3 {
	public static void main(String[] args) {

		// 이진탐색 - 반을 분할해서 찾아가는 방법
		// 조건 - 순서대로 정렬
//		1. 포인터(start, end)를 처음과 끝에 2개를 배치
//		2. 중간값을 구함
//		3. 중간값이 찾는 값인지 확인
//		4. 중간값이 찾는 값보다 크다면 end를 중간값-1로 내림
//		5. 중간값이 찾는 값보다 작다면 start를 중간값+1로 올림

		int arr[] = { 1, 3, 5, 10, 20, 30, 50, 80, 100 };

		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 값> ");
		int find = scan.nextInt();

		int start = 0;
		int end = arr.length - 1; // 8
		int count = 0; // 회전수 확인

		while (start <= end) {
			count++; // 회전수 확인

			// 중간값은 while문 안에서 구함
			int mid = (start + end) / 2;
			
			if(arr[mid] == find) {
				System.out.println("회전수: "+count);
				System.out.println("찾는 값은: "+mid+"번째 존재함");
				break;
			}  //else 찾을 값이 없을때를 출력하고 싶으면 여기에 쓰면 안됨
            
			else if (arr[mid] < find) { // 찾을 값이 중간값보다 큰 경우   **** else if구문은 쓰면 안되나...
				start = mid + 1;
			} else { // 찾을 값을 중간값보다 작은 경우
				end = mid - 1;
			}
		}
		// 찾는 값이 없을 때 - 두 지점이 교차했다면 찾는 값은 없음.  ***** if 구문 꼭 써야할까...
		if(start > end) {
			System.out.println("찾는 값은 없습니다");
		}
		
		
		// 이진탐색 Arrays.binarySearch(배열,찾을값) -> 찾은 위치를 알려줌
		// 찾는 값이 없으면 음수값을 출력
		System.out.println(Arrays.binarySearch(arr, 101)); 

	}
}
