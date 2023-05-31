package day11.inter.basic;

public class MainClass {
	public static void main(String[] args) {

		Basic b = new Basic();
		b.method01(); // override
		b.mehtod02(); // override
		b.method03(); // 나의 메서드
		
		System.out.println("==================");
		
//		인터페이스도 데이터 타입이 될 수 있음
		 Inter1 i1 = new Basic();
		 i1.method01(); // Inter1에 있는 기능만 사용 가능
		 
		 
		 Inter2 i2 = new Basic();
		 i2.mehtod02(); // Inter2에 있는 기능만 사용 가능
		 
		 System.out.println("==================");
		 
//		 인터페이스에서도 클래스 캐스팅을 사용할 수 있음
		 Basic bb = (Basic)i2; // Basic 클래스의 모든 기능 사용 가능
		 bb.mehtod02();
		 bb.method01();
		 bb.method03();
		 
//		 static 메서드의 사용 - 인터페이스명.메서드명();
		 Inter1.method3();
		 
//		 default 메서드는 상속이 내려옴
//		 - 인터페이스에 미리 만들어진 몸체를 가지고 있는 메서드
		 bb.method4();
	}
}
