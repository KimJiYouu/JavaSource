package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		String [] arr = {"안녕", "hello", "니하오", "오하", "$$$"};
		/*
		 * 렌덤수를 생성하고, 이 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리
		 * 출력된 문자열이, 어느나라 언어인지 판별해서 출력
		 */
		
		int ran = (int)(Math.random()*arr.length); // index 0 ~ 4 --> 5 곱해주기 5 : 배열의 길이
		System.out.println(ran);
		System.out.println("선택된 단어 : " + arr[ran]);
		switch (ran) {
		case 0 :
			System.out.println("한국어");
			break;
		case 1 :
			System.out.println("영어");
			break;
		case 2 :
			System.out.println("중국어");
			break;
		case 3 :
			System.out.println("일본어");
			break;
		default :
			System.out.println("알 수 없는 언어");
		}
	}
}
