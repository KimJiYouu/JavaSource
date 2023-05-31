package day01;

public class Operator3 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 뒤에 소괄호가 true면 if 중괄호 실행, false면 else문 실행
		if(x != 10 & ++y == 21) { // 거짓 & 참
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
			
		}
		
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		
		if(x == 10 | ++y == 21) {  // 참 | 거짓 
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		
		System.out.println("------------------");
		
		x = 10;
		y = 20;
		
		if(x != 10 && ++y == 21) { // 거짓 && 판단x
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		
		
		if(x == 10 || ++y == 21) {  // 참 || 판단x
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
	}
}
