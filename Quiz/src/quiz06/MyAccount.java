package quiz06;

import java.util.Scanner;

public class MyAccount extends Account {
/* Account를 상속받고 withDraw()를 오버라이딩하여
 * 사용자 입력(Scanner)를 통해 비밀번호가 일치하면 출금
 * 부모클래스의 생성자는 상속이 안되므로 MyAccount에 생성자를 생성
 */

	Scanner scan = new Scanner(System.in);


	MyAccount(String ss, String pw, int bal){
		this.accountNumber = ss;
		this.password = pw;
		this.balance =  bal;
		
		System.out.println("계좌번호: "+accountNumber);
		System.out.println("비밀번호: "+password);
		System.out.println("잔고: "+balance);
	}
	
	void withDraw(int out) { // 메서드2
		// 잔고가 매개변수보다 클때만 출금이 가능하도록
		System.out.print("비밀번호> ");
		String pw = scan.next();
		if (pw.equals(password)) {

			if (balance >= out) {
				balance -= out;
				System.out.println("출금 후 잔고: " + balance + "원");
			} else {
				System.out.println("잔액 부족");
			}
		} else {
			System.out.println("비밀번호 불일치");
		}
	}
}
