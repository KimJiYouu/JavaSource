package quiz08;

public class MyCart2 extends Cart {

	MyCart2(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}

	void buy(String product) {
		switch (product) {
		case "tv":
			if (this.money < tv) {
				System.out.println("금액부족");
				return; // buy 메서드 종료
			} else {
				this.money -= tv;
			}

			break;
		case "com":
			if (this.money < com) {
				System.out.println("금액부족");
				return;
			} else {
				this.money -= com;
			}
			break;
		case "radio":
			if (this.money < radio) {
				System.out.println("금액부족");
				return;
			} else {
				this.money -= radio;
			}
			break;

		default:
			System.out.println("올바른 상품이 아님");
			return;

		}
		add(product);
	}

	void add(String product) {
		i++;
		if (i >= cart.length) {
			String[] newCart = new String[cart.length * 2];
			for (int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			newCart = null;
		}
		cart[i - 1] = product;

		info();
	}

	void info() {
		String str = "[";
		for (int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		System.out.println(str);
		System.out.println("잔액: " + money);
	}
}
