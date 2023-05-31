package quiz08;

public class CartMain {
	public static void main(String[] args) {
		
		MyCart cart = new MyCart(3000);
		
		cart.buy("tv");
		cart.buy("radio");
		cart.buy("com");
		cart.buy("tv");
		cart.buy("radio");
		cart.buy("tv");
		cart.buy("teli");
		cart.buy("com");
		cart.buy("radio");
		cart.buy("tv");
		cart.buy("com");
//		cart.info();
//		System.out.println("잔액: "+cart.money);
		System.out.println("=======");
		MyCart2 cart2 = new MyCart2(2000);
		cart2.buy("tv");
		cart2.buy("radio");
		cart2.buy("com");
		cart2.buy("radio");
		cart2.buy("tv");
		cart2.buy("com");
		
	}

}
