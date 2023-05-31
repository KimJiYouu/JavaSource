package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 맵을 이용하는데 key : 메뉴이름 value: 가격
		Map<String, Integer> map = new HashMap<>();

		while (true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); // 이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); // 메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); // 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); // 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); // 종료

			System.out.print("카테고리입력> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("등록할 음식: ");
				String food = scan.next();
				if (!map.containsKey(food)) {
					System.out.print("가격: ");
					int price = scan.nextInt();
					map.put(food, price);
				} else {
					System.out.println("이미 존재하는 메뉴입니다");
				}

			} else if (menu == 2) { // 메뉴판 전체 보기

//				Set<Entry<String, Integer>> setMenu = map.entrySet();
//				for(Entry<String, Integer> x : setMenu) { // 방법1

				for (Entry<String, Integer> x : map.entrySet()) { // 방법2
					System.out.println(x.getKey() + ": " + x.getValue() + "원");
				}

			} else if (menu == 3) {// 메뉴판 수정
				System.out.print("수정할 음식: ");
				String food2 = scan.next();
				if (map.containsKey(food2)) {
					System.out.print("수정된 가격: ");
					int price2 = scan.nextInt();
					map.put(food2, price2);
					System.out.println(food2 + ": " + map.get(food2) + "원");
				} else {
					System.out.println("메뉴에 없음");
				}

			} else if (menu == 4) { // 삭제
				System.out.print("삭제할 음식: ");
				String food3 = scan.next();
//				if (map.containsKey(food3)) {
//					map.remove(food3);
//					System.out.println("삭제되었습니다");
//				} else {
//					System.out.println("메뉴에 없음");
//				}
				Integer a = map.remove(food3); // remove 반환값이 index 아니면 null
				if (a != null) {
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("메뉴가 없습니다");
				}

			} else if (menu == 5) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
	}
}
