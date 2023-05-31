package day01;
public class Casting01 {
	public static void main(String[] args) {
		//작은 크기의 타입을 큰 크기의 타입에 넣을 때에 자동형변환이 일어남
		byte a = 10;
		short s = a; //자동형변환 byte --> short
		int i  = a; //자동형변환 byte -->int
		long I = a; //자동형변환 byet -->long
		
		//문자와 숫자간에도 유효함
		char c = '가';
		int j = c; // char --> int
		System.out.println(j); // 44032
		
		int k = 1000;
		double d = k; // int --> double
		System.out.println(d);
		
	}

}
