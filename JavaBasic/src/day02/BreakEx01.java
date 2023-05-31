package day02;

public class BreakEx01 {
	public static void main(String[] args) {

//		for(int i = 1; i <=10; i++) {
//			System.out.println(i); // 1 2 3 4 5
//			
//			if(i == 5) break;
//			System.out.println(i); // 1 2 3 4
//		}

//		무한 반복문
//		- 반복문의 횟수를 정확히 모를 때 사용
//		- java는 while(true) 문장을 많이 사용함
//		- 특정 조건에서 탈출하는 형식으로 사용됨

		int i = 1;
		while (true) {
			System.out.print(i+" ");

			if (i == 5) {
				System.out.println("\n그만");
				break;
			}
			i++;
		}
	}
}
