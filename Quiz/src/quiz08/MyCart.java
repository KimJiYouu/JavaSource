package quiz08;

import java.util.Arrays;

public class MyCart extends Cart { // 자식 클래스

//1.생성자는 money를 전달받고 money값 초기화, 
//	tv = 300 com = 400 radio = 500
//2. buy() add() info() 메서드 overriding
//     상품명 "tv" "com" "radio"
//  buy(상품명) 기능
//	매개변수가 tv com radio라면 금액에서 상품가격을 차감하고 add()메서드를 실행합니다.
//	단, 올바른 상품이 아니거나 금액이 부족할 경우에는 적절한 처리

//	add(상품명) 기능
//	매개변수로 넘어온 상품을 cart배열에 순서대로 담아줌
//	단, cart 배열이 다 찼으면 2배 크기의 cart배열로 옮겨줌.1 2 4 8 16 32
//	마지막에는 info() 메서드를 호출

//	info()는 cart배열에 담긴 물건 목록만 (null 제외) 출력

	MyCart() {
	}

	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}

	void buy(String product) {
		if (product.equals("tv")) {
			if (this.money >= tv) {
//					count++;
				this.money -= tv;
//				this.add(product);
			} else {
				System.out.println("금액부족");
				System.out.println("==============================");
				return; // buy 메서드를 종료시키서 if문 아래 실행문은 실행 안시킴
			}
		} else if (product.equals("com")) {
			if (this.money >= com) {
//					count++;
				this.money -= com;
//				this.add(product);
			} else {
				System.out.println("금액부족");
				System.out.println("==============================");
				return;
			}
		} else if (product.equals("radio")) {
			if (this.money >= radio) {
//					count++;
				this.money -= radio;
//				this.add(product);
			} else {
				System.out.println("금액부족");
				System.out.println("==============================");
				return;
			}
		} else {
			System.out.println(product + "는 올바른 상품이 아님");
			System.out.println("==============================");
			return;
		}
		add(product);
	}

	int count = 0;

	void add(String product) {
		count++;
		if (count <= cart.length) {
			cart[count-1] = product;

		} else {
			String[] newCart = new String[cart.length * 2];
			for (int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			newCart = null;
			cart[count - 1] = product;
		}

		info();
	}

	void info() {
		System.out.print("주문한 상품 목록: [");
		for (int i = 0; i < count; i++) {
			System.out.print(cart[i] + " ");
		}
		System.out.println("]");
		System.out.println("잔액: " + this.money);
		System.out.println("==============================");
	}
}
