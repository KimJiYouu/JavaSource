package day07.override01;

public class MainClass {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01(); // 본인의 메서드
		p.method02(); // 본인의 메서드
		
		Child c = new Child();
		c.method01(); // 상속받은 메서드
		c.method02(); // override된 메서드 실행
	}
}
