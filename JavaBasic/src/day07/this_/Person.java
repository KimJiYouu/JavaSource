package day07.this_;

public class Person {

	String name;
	int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("이거실행됨");
//		System.out.println(this.info());
//		System.out.println(this);
//		System.out.println(this); // this 객체가 만들어진 위치
	}
	
	Person(String name){
//		this.name = name;
//		this.age = 25;
//		System.out.println(this); // this 객체가 만들어진 위치
		this(name, 25); // 같은 클래스 내 생성자 호출
	}
	
	Person(){
//		this.name = "이름없음";
//		this.age = 2;
//		System.out.println(this); // this 객체가 만들어진 위치
		this("이름없음",3); // 같은 클래스 내 생성자 호출
	}
	
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
