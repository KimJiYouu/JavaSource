package day07.override01;

public class Child extends Parent{
	
/*
* override의 규칙
* 1. 반드시 상속관계를 지녀야 함
* 2. 반드시 부모님 메서드이 모형이 같아야 함
*/

	void method02() {
		System.out.println("자식의 override된 2번 메서드");
	}
}
