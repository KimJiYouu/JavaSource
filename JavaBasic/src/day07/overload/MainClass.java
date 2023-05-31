package day07.overload;

public class MainClass {
	public static void main(String[] args) {

		Basic b = new Basic();
		b.input("안녕");
		b.input(3, 3.14);
		b.input(3.14, 3);
		b.input(3, 'a', 3.5);

	}
}
