package day08.super_2;

public class Person extends Object { // extends object 생략

	String name;
	int age;
	

	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("이름? "+name+" 나이? "+age);
	}
	
	Person(String name){
		this(name, 25); // 같은 클래스 내 생성자 호출
	}
	
	Person(){
		this("이름없음",3); // 같은 클래스 내 생성자 호출
	}
	
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
