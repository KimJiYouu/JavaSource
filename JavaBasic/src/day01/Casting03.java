package day01;

public class Casting03 {

	public static void main(String[] args) {
		
		char c = 'C';
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서 큰 타입에 맞추어 형변환
		// char cc = c + i; (X)
		char cc = (char)(c + i);
		System.out.println(cc);
		int ii = c + i;
		System.out.println(ii);
		System.out.println((char)ii);
		
		//2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
//		byte b3 = b1 + b2; (X) --> 컴퓨터가 32bit연산만 가능하기 때문에 연산할 때 int형으로 변환해서 결과 도출시킴 
		byte b3 = (byte)(b1 + b2);
		
		short s1 = 100;
		byte b = 10;
//		short s2 = s1 + b; // int
		short s2 = (short)(s1 + b);
		
		
		

	}

}
