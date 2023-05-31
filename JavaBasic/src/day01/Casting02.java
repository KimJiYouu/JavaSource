package day01;

public class Casting02 {

	public static void main(String[] args) {
		//큰 크기의 타입을 작은 크기의 타입에 넣을 때에 (type)캐스팅을 사용해서 명시적으로 변환
		int i = 70;
		char c = (char)i; //casting 
		short s = (short)i;
		System.out.println(c);
		System.out.println(s);
		
		float f = 3.14F;
		int k = (int)f;
		System.out.println(k);
		
		//주의할 점 - 타입변환 시 값을 받을 수 없는 범위가 들어오면 잘려나간 후의 값을 저장함
		int a = 1000; //2진수 0011 1110 1000
		byte b = (byte)a; // 1110 1000
		System.out.println(b);
		
		//특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어감
		char cc = 'A';
		short ss = (short)cc;
		System.out.println(ss);
		
	}

}
