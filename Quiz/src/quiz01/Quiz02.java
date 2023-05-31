package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		int result = (int)(Math.random() * 100) + 1;
				System.out.println("result : " + result);
		//랜덤하게 나온 수가 3의 배수인지, 3의 배수가 아닌지 3항 연산식으로 결과 출력
		String dd = result % 3 ==0 ? "3의 배수" : "3의 배수가 아님";
		System.out.printf("%d은 %s\n",result, dd );
		System.out.println(result % 3 ==0 ? result+"는 3의 배수" : result+"는 3의 배수가 아님");
	}
}
