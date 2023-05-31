package day10.static_singleton;

public class MainClass2 {
	public static void main(String[] args) {

		NotSingleton s = NotSingleton.getSingleton();
		NotSingleton s2 = NotSingleton.getSingleton();

		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(s.getDomain());
		System.out.println(s2.getDomain());

	}

}
