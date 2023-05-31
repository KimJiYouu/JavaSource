package day10.static_method;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {

		Count c = new Count();
		c.method01(); // 일반method
		c.method2(); // static method

//	static 메서드의 사용
		Count.method2();

//  static 메서드의 사용	
		Math.random();
		Arrays.toString(new int[3]);
		Integer.parseInt("3");
	}
}
