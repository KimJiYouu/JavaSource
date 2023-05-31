package day06.import_ex;

import day06.fruit.Apple; // 패키지 명을 포함한 클래스명
import day06.fruit.Melon;
import day06.fruit.*; // 해당 패키지에 있는 모든 클래스를 다 사용

public class MainClass {
	public static void main(String[] args) {

		Apple app = new Apple(); // 다른 패키지에 있음
		Melon melon = new Melon();
	}
}
