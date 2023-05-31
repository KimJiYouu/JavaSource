package day02;

public class ContinueEx01 {
	public static void main(String[] args) {

//		continue는 반복문을 건너뜀
//		for문에서는 증/감식으로 이동됨

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue; // i++로 이동
			}
			System.out.print(i + " "); // 1 2 3 4 6 7 8 9 10

		}

//		while문에서는 continue는 조건식으로 감.
		int i = 1;
		while (i <= 10) {

			if (i == 5) {
				i++; // 이 증감식이 없으면 무한 루프 1234
				continue; // while조건식으로 이동
			}
			System.out.print(i + " "); // 1 2 3 4 5 6 7 8 9 10
			i++;
		}
	}
}
