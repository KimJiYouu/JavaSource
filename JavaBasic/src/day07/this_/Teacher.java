package day07.this_;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String info() { // 부모클래스와 동일한 메서드에 내용만 바꿈
		return "이름: "+name+", 나이: "+age+", 과목: "+subject;
	}
}
