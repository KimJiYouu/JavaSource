package quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		User u = new User();
		u.setName("홍길동");
		String name1 = u.getName();
		u.setRrn(123123);
		int rrn1 = u.getRrn();
		u.setAge(20);
		int age1 = u.getAge();
//		User u = new User("홍길동", 123123, 20); 도 가능함
		System.out.println("("+name1+", "+rrn1+", "+age1+")");
		

		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		User[] arr = new User[2]; // User객체의 주소값으로 저장
		User u2 = new User();
		u2.setName("김길동");
		u2.setRrn(456456);
		u2.setAge(30);
		arr[0] = u; // u객체의 주소값 저장
		arr[1] = u2; // u2 객체의 주소값 저장
		for(User us:arr) {
			String name = us.getName();
			int rrn = us.getRrn();
			int age = us.getAge();
//			System.out.println("이름: "+name);
//			System.out.println("번호: "+rrn);
//			System.out.println("나이: "+age);
			System.out.println("("+name+", "+rrn+", "+age+")");
		}
		System.out.println("+++++++++++++");
		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i].getName());
//			System.out.println(arr[i].getRrn());
//			System.out.println(arr[i].getAge());
			System.out.println("("+arr[i].getName()+", "+arr[i].getRrn()+", "+arr[i].getAge()+")");
		}

		
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */

		Scanner scan = new Scanner(System.in);
		User[] uu = new User[5];
		int i = 0;
		while(i<uu.length) {
			System.out.print("name: ");
			String name2 = scan.next();
			System.out.print("rrn: ");
			int rrn2 = scan.nextInt();
			System.out.print("age: ");
			int age2 = scan.nextInt();
			
			// while문 안에 만들어야 반복하는 횟수만큼 객체 생성됨
			User u3 = new User(name2, rrn2, age2); 
			uu[i] = u3;
			i++;
		}
		System.out.println(Arrays.toString(uu));
		
	}
}
