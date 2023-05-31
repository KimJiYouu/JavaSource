package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); // 10 -2 = 8, 8+5 = 13, x = 3
		System.out.println(x+=2); // 3+2 = 5
		System.out.println( !('A' <= c && c <='Z') ); //false
		System.out.println('C'-c); // 2
		System.out.println(c+1); // 66
		System.out.println(c++); // 단항연산자이기 때문에 int로 치환되지 않음 A
		System.out.println(c); // B
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
