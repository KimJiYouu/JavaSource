package quiz19;

import java.util.LinkedList;

public class ListQuiz01 {

	public static void main(String[] args) {
// List 1번		
// 1. list에 1~20까지 값을 순서대로 저장
// 2. list에 값을 순서대로 출력

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
			System.out.println(list.get(i - 1));
		}

// List 2번
// 1. User을 저장하는 list 생성
// 2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
// 3. User 객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
// 4. User 객체 안에 홍길자가 있으면 해당 객체를 삭제

		LinkedList<User> list2 = new LinkedList<>();

		User u = new User("홍길자", 20);
		User uu = new User("홍길순", 21);
		User uuu = new User("홍길동123s", 22);

		list2.add(u);
		list2.add(uu);
		list2.add(uuu);

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().contains("홍길동")) {  // contains 와 equals 차이점!!!!
				System.out.println("이름: " + list2.get(i).getName() + ", 나이: " + list2.get(i).getAge());
			
			}

		}
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().equals("홍길순")) {
				list2.remove(i);
				System.out.println(list2.toString());
			}
		}
	}
}
