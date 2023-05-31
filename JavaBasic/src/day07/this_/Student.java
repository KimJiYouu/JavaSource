package day07.this_;

public class Student extends Person {

	String studentId;
	Student(){
	}
	
	Student(String name, int age, String studentId){
		super(); // 작성안해도 자동 생성
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	Student(String name){
		this(name,12,"12345");
	}
	
	String info() {
		return "이름: "+name+", 나이: "+age+", 학번: "+studentId;
	}
}
