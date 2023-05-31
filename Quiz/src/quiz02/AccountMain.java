package quiz02;

public class AccountMain {
	public static void main(String[] args) {

		Account Jane = new Account("Jane123123", "a123123", 50000);
		Jane.deposit(5000);
		Jane.withDraw(4000);
		Jane.deposit(10000);
		int balance = Jane.getBalance();
		System.out.println("최종 잔고: " + balance + "원");

		System.out.println("============");

		Account Anne = new Account("Anne345345", "b345345", 1000);
		Anne.deposit(-500);
		Anne.withDraw(500000);
		System.out.println("최종 잔고: " + Anne.getBalance());
	}
}
