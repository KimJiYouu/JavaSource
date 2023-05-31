package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<User> list = new ArrayList<>(); // 배열 대체

		while (true) {
			System.out.println("[1.등록 | 2. 회원정보확인 | 3. 회원정보검색 | 4. 회원정보삭제 | 5. 프로그램종료]");

			System.out.print("메뉴번호> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				// 이름 나이를 입력받아서 user 객체에 저장, 리스트에 순서대로 추가
				System.out.print("이름: ");
				String name = scan.next();
				System.out.print("나이: ");
				int age = scan.nextInt();
				User u = new User(name, age);
				list.add(u);
				break;

			case 2:
				// 리스트에 담긴 모든 회원 이름과 나이를 출력
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println("이름: "+list.get(i).getName()+", 나이: "+list.get(i).getAge());
//				}
				
				for(User u2: list) { // 향상된 for문
					System.out.println("이름: "+u2.getName()+", 나이: "+u2.getAge());
				}
				break;

			case 3:
				// 찾을 이름을 새롭게 입력받아서 이름이 있다면 이름과 나이를 출력
				// 조건 - 찾는 이름이 없다면 "---은 목록에 없습니다" 출력
				System.out.print("검색어: ");
				String searchName = scan.next();
				boolean bool = true; // 상태변수
				for (int i = 0; i < list.size(); i++) {
					if (searchName.equals(list.get(i).getName())) {
						System.out.println("이름: "+list.get(i).getName()+", 나이: "+list.get(i).getAge());
						bool  = false; // 실행했음
						break;
					} 
				}
				if(bool) System.out.println(searchName+"은 목록에 없습니다");
				break;

			case 4:
				// 삭제할 이름을 입력받아서 이름과 동일한 User객체를 첫번째 객체 1개만 삭제
				System.out.print("삭제할 이름: ");
				String deleteName = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (deleteName.equals(list.get(i).getName())) {
						list.remove(i);
						break;
					}
				}
				break;

			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 번호");
				break;
			}
		}
	}
}
