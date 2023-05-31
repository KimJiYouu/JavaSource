package day10.static_method;

public class Count {

	public int a;
	public static int b;

//	 일반 메서드 - 일반멤버와 정적멤버 모두 사용이 가능
	public int method01() {
		a = 10;
		b++;

		return b;
	}

//	 정적 메서드 - 정적멤버는 사용이 가능하지만 일반멤버는 사용할 수 없음
	public static int method2() {
		/*a = 10; 
         *a는 static이 생성될 당시에 a변수는 존재하기 전이므로 a 참조 불가
         */

		/*단, 객체생성을 통해서는 일반멤버 사용이 가능함*/
		Count c = new Count();
		c.a = 10;

		b++;
		return b;
	}

	
	
//	main과 연관지어 생각 - main은 static
	public static void main(String[] args) {

		Count c = new Count();
		c.method01(); // 일반method
		c.method2(); // static method

//		static 메서드의 사용
		Count.method2();
	}
}
