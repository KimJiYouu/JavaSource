package quiz16;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {

//		updown게임 
//		1~100까지 랜덤한 수를 1번 생성 (반복문밖에서)
//		스캐너를 통해서 값을 입력받음
//		랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
//		랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
//		정답을 맞추면 시도횟수 : x회를 출력하고 종료

//		에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드 변경

		Scanner scan = new Scanner(System.in);

		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		int i = 1;

		while (true) {
			try {

				System.out.print("정답입력> ");
				int num2 = scan.nextInt();

				if (num2 > num) {
					System.out.println("더 작은 수를 입력하세요");
				} else if (num2 < num) {
					System.out.println("더 큰 수를 입력하세요");
				} else {
					System.out.println("정답입니다");
					System.out.println("시도횟수 : " + i);
					break;
				}
			} catch (Exception e) { 
				System.out.println("숫자를 입력하세요");
				scan.nextLine();
			}
			i++;
		}
	}
}
