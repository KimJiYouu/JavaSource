package day09.poly.basic2;

public class House {

//	private Student[] student = new Student[100];
//
//	private Employee[] employee = new Employee[100];
//	
//	private Teacher[] teacher = new Teacher[100];
//	
//	private int index1;
//	private int index2;
//	private int index3;
//	
//	public void inHouse(Student s) {
//		student[index1] = s;
//		index1++;
//	}
//	public void inHouse(Teacher t) {
//		teacher[index2] = t;
//		index2++;
//	}
//	public void inHouse(Employee e) {
//		employee[index3] = e;
//		index3++;
//	}


	private Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {
		person[index] = p;
		index++;
	}

	// 추가-> 배열안에 들어있는 객체의 타입에 맞추어 출력
	public void printHouse() {
		
		for(int i = 0; i < index; i++) {
//		System.out.println(person[i]);
			
			if(person[i] instanceof Student) {
				System.out.println("you are a student");
			} else if(person[i] instanceof Teacher) {
				System.out.println("you are a teacher");
			} else if(person[i] instanceof Employee) {
				System.out.println("you are a employee");
			} else {
				System.out.println("you are a person");
			}
		}
	}
	
//	public void whoAreYou(Person p) {
//		if(p instanceof Student) { // student라면 true
//			System.out.println("너는 학생이야!");
//			
//			Student s = (Student)p; // 캐스팅 가능
//			
//		} else if(p instanceof Teacher) {
//			System.out.println("너는 선생이야!");
//			
//			Teacher t = (Teacher)p;  // 캐스팅 가능
//			
//		} else if(p instanceof Employee) {
//			System.out.println("너는 직원이야!");
//			
//			Employee e = (Employee)p; // 캐스팅 가능
//		} else {
//			System.out.println("너는 그냥 사람이야");
//		}
//	}
}
