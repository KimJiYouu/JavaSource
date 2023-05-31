package quiz11;

public class ComputerMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com = new Computer(new KeyBoard(), new Monitor(), new Mouse());
		com.computerInfo();
		
		Monitor m = com.getMon();
		m.info();
	}
}
