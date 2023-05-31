package quiz11;

public class ComputerMain {
	public static void main(String[] args) {

		Computer com = new Computer();
		KeyBoard key = com.getKey();
		key.info();
		Monitor mon = com.getMon();
		mon.info();
		Mouse mou = com.getMou();
		mou.info();
		
		System.out.println("+++++++++++++");
		
		com.computerInfo();
	}
}
