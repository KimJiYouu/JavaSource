package day08.modi.member.pac1;

public class B {
	
	//사용
	A a = new A(); // public
	A a2 = new A(1); // default
//	A a3 = new A("Jane"); // private은 같은 클래스 내에서만 접근 가능하므로 다른 클래스는 사용불가
	
	public B() {
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3; // var3가 private이라 접근 불가
		a.method1();
		a.method2();
//		a.method3(); // method3가 private라 접근 불가
				
	}
}
