package day09.poly.basic2;

public class Teacher extends Person {

	String subject;
	Teacher(){
	}
	
	Teacher(String name, int age, String subject){
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.subject = subject;
	}
	
	Teacher(String name, String subject){
		this(name, 35, subject);
	}
	String info() { // 부모클래스와 동일한 메서드에 내용만 바꿈
		return super.info()+", 과목: "+subject;
	}
}
