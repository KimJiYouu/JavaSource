package day08.super_;

public class Child extends Parent{

	String me; 
	
// 부모님의 기본 생성자가 없을 때의 오류 해결 방안
//	1. 부모님의 기본 생성자를 만든다. 
//	-> 부모클래스를 수정하는 건 불가능할 때가 있으므로 비추..
//	2. 자식에서 super()통해서 부모님의 생성자와 강제연결한다.
	
	Child(String me){
		super("홍순자","홍길동"); // 부모 클래스의 생성자와 강제 연결
		this.me = me; // 자식클래스만의 변수
	}

}
