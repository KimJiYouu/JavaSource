package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01_1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<User> lists = new ArrayList<>();
		User u1 = new User("홍길동", 10);
		User u2 = new User("이순신", 20);
		User u3 = new User("홍길자", 30);
		lists.add(u1);
		lists.add(u2);
		lists.add(u3);

		for (int i = 0; i < lists.size(); i++) {
			User u = lists.get(i);
			String name = u.getName();
			if (name.equals("홍길동")) {
				System.out.println(name);
				System.out.println(u.getAge());
			}
		}

		for (int i = 0; i < lists.size(); i++){
			User u = lists.get(i);
			if(u.getName().equals("홍길자")) {
				lists.remove(i);
			}
		}
	}
}
