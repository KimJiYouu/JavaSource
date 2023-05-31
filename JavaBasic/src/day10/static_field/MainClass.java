package day10.static_field;

public class MainClass {
	public static void main(String[] args) {

		Count c1 = new Count();
		c1.a++;
		c1.b++;

		System.out.println("c1의 a: " + c1.a);
		System.out.println("c1의 b: " + c1.b);

		Count c2 = new Count();
		c2.a++;
		c2.b++;

		System.out.println("c2의 a: " + c2.a);
		System.out.println("c2의 b: " + c2.b);

		Count c3 = new Count();
		c3.a++;
		c3.b++;

		System.out.println("c3의 a: " + c3.a);
		System.out.println("c3의 b: " + c3.b);

		// 현재 c1.b는 몇일까요? 3

		System.out.println("==================");
//static 은 클래스 밖에 1개가 생성이 되기 때문에
//객체 생성없이 클래스이름.변수명 으로 사용함

		Count.b++;
		System.out.println(Count.b);
		Count.b = 100;
		System.out.println(Count.b);
	}
}
