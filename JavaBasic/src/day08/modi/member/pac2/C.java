package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	//사용
	A a = new A(); // public만 다른 패키지에서 접근 가능
//	A a2 = new A(1); // default 접근 불가
//	A a3 = new A("Jane"); // private 접근 불가
	
	public C() {
		a.var1 = 1;
//		a.var2 = 2; // default 접근 불가
//		a.var3 = 3; // private 접근 불가
		
		a.method1();
//		a.method2(); // default 접근 불가
//		a.method3(); // private 접근 불가 
	}
}
