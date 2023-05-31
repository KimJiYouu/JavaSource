package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		//변수는 중괄화 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
		int num1 = 10;
		int num2 = 20;
		
		int num4 = 0; // 변수의 선언부
		
		if(true) {
			int num3 = num1 + num2; //30
			
			//여기에서 num4의 값을 변경을 하고, 바깥에서 사용하고 싶음 --> 선언을 if문 위에서 선언
			num4 = 1000;
			
		}
		int num3 = 100; // num3은 if문장을 벗어나면서 사라졌기 때문에 동일한 이름의 변수를 선언할 수 있다
		System.out.println("num3 = " + num3);
		
		System.out.println("num4 = "+ num4);
		
		

	}

}
