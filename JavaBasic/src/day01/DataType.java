package day01;

public class DataType {

	public static void main(String[] args) {
		//정수형타입
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123L; // 정수는 기본적으로 int로 저장되기 때문에 long 타입으로 저장하기 위해선 L을 붙여줘야함
		
		//2진수, 8진수, 16진수
		int bin = 010; // 8진수는 앞에 0을 붙임
		System.out.println("8진수 010은 "+ bin+"입니다!");
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은 " + bin2);
		
		int hexa = 0xA9; //16진수는 앞에 0X를 붙임
		System.out.println("16진수 A9는 "+ hexa); //16x10+9
		
		System.out.println("--------------------");
		
		//실수형 타입
		float f1 = 3.14F; //실수는 기본적으로 double로 저장되기 때문에 float으로 저장할 시 F를 붙여줌
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.14159278F; //7자리까지 유효
		double d2 = 3.14159277777788888888;//15자리까지 유효
		
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("--------------------");
		
		//true, false만 저장 가능함
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
	}

}
