package quiz11;

public class ComputerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyBoard key = new KeyBoard();
		Monitor mon = new Monitor();
		Mouse mou = new Mouse();
		
		Computer com = new Computer(key, mon, mou);
		com.computerInfo();

	}
}
