package day08.super_2;

public class Student extends Person {

	String studentId;
	Student(){
	}
	
	Student(String name, int age, String studentId){
		super(name, age); 
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}
	Student(String name){
		this(name,12,"12345");
	}
	
	String info() {
		return super.info()+", 학번: "+studentId;
	}
}
