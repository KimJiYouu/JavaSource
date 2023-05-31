package day07.this_;

public class Employee extends Person {

	String department;
	Employee(){
	}
	
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	Employee(String name, int age){
		this(name, age, "영업부");
//		System.out.println(this);
		
	}
	String info() {
		return "이름: "+name+", 나이: "+age+", 부서: "+department;
	}
}
