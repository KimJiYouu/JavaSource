package quiz02;

public class Account {
//	한 사람의 은행 계좌
	/*
	 * accountNumber 변수 - 식별아이디 
	 * password 변수 - 비밀번호 
	 * balance 변수 - 잔고
	 * 
	 * 생성자> 
	 * 변수3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드> 
	 * deposit: void - 잔고에 매개변수를 누적하는 기능 
	 * withDraw: void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance: int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서 각각의 기능을 확인
	 */

	String accountNumber;
	String password;
	int balance;

	Account(String acc, String pass, int bal) { // 생성자
		accountNumber = acc;
		password = pass;
		balance = bal;
		System.out.println("계좌아이디: " + accountNumber);
		System.out.println("비밀번호: " + password);
		System.out.println("현재잔고: " + balance + "원");
	}

	void deposit(int in) { // 메서드1
		// 매개변수가 양수 일때만 가능하도록 변경
		if (in > 0) {
			balance += in;
			System.out.println("잔고: " + balance + "원");
		} else {
			System.out.println("잘못된 금액");
		}
	}

	void withDraw(int out) { // 메서드2
		// 잔고가 매개변수보다 클때만 출금이 가능하도록
		if (balance >= out) {
			balance -= out;
			System.out.println("잔고: " + balance + "원");
		} else {
			System.out.println("출금 불가능");
		}
	}
	int getBalance() { // 메서드3
		return balance;
	}
}
