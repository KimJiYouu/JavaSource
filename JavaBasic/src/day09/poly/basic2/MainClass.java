package day09.poly.basic2;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person("Charlie", 20);
		Student s1 = new Student("Lola", 20, "123123");
		Student s2 = new Student("Don", 30, "345345");

		Teacher t1 = new Teacher("Lauren", 40, "Baseball");
		Teacher t2 = new Teacher("Jane", 40, "Football");

		Employee e1 = new Employee("Rach", 50, "Music");

		// Student[] arr = {s1,s2};
		// Teacher[] ar2 = {t1,t2};

		// 부모타입을 활용한 배열의 다형성
		// 부모타입 배열에 값 저장하는 방법 1) main메서드에서 바로 저장
		Person[] arr = { p, s1, s2, t1, t2, e1 };

		for (Person person : arr) {
			// overriding된 메서드는 알아서 오버라이딩된 걸로 출력됨
			System.out.println(person.info()); 
		}
		System.out.println("===============================");

		// 부모타입 배열에 값 저장하는 방법 2) 클래스에서 생성한 메서드로 저장
		// House 객체의 inHouse 메서드를 실행
		House h = new House();
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);

		h.printHouse();

//		 h.whoAreYou(p);
//		 h.whoAreYou(s1);
//		 h.whoAreYou(t1);
//		 h.whoAreYou(e1);

	
	}
	

}
