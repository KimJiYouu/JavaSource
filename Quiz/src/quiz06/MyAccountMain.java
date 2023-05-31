package quiz06;

public class MyAccountMain {

	public static void main(String[] args) {
		
		MyAccount Jane = new MyAccount("jane123456", "jane123", 10000);
		
		Jane.deposit(5000);
		Jane.withDraw(1000);
		Jane.withDraw(500);
		Jane.withDraw(10000);
	}
}
