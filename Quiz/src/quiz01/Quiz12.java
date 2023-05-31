package quiz01;

public class Quiz12 {
	public static void main(String[] args) {
		
		// 1000까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 count개수 구하기
		
		int i = 1;
		int count = 0;
		
		while(i<=1000) {
			if(i%4 ==0 && i%8 != 0) {
				count++; // 1씩 누적시킴
			}
			i++;
		}
		System.out.println("개수 : " +count);
		
		
		// 50~100까지의 합계
		
		int j = 50;
		int sum = 0;
		
		while(j<=100) {
			sum += j;
			j++;
		}
		System.out.println("50~100까지의 합계 : "+sum);
	}
}
