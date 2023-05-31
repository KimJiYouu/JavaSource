package day09.poly.basic2;

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
	}
	
	String info() {
		return super.info()+", 부서: "+department;
	}
}
