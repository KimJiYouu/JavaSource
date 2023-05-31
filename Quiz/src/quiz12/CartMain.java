package quiz12;

public class CartMain {

	public static void main(String[] args) {

		MyCart c = new MyCart(2000);
		
		// buy 메소드의 매개변수 타입이 Product이므로 자식 클래스들을
		// Product 타입으로 형변환해줘야 변수를 대입할 수 있음
		// 각각의 객체 타입으로 생성해줘도 자동 형변환이 됨
		Product tv = new Tv();
		Product computer = new Computer();
//		Product radio = new Radio();

		c.buy(tv);
		c.buy(new Radio());
		c.buy(computer);
		c.buy(tv);
	}
}
