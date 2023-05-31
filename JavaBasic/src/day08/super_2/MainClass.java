package day08.super_2;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("Jane", 20);
		System.out.println(p1);

		Person p2 = new Person("Charlie");
		
		Person p3 = new Person();
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		System.out.println("===============");
		
		Employee emp = new Employee("Lola", 25);
		System.out.println(emp.info());
		
		Student s = new Student("Don");
		System.out.println(s.info());
		
		Teacher t = new Teacher("Lauren","Math");
		System.out.println(t.info());
		
		
	
	}
}
