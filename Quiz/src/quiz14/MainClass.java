package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		
		System.out.println("armor: "+m.armor);
		System.out.println("attack: "+m.attack);
		System.out.println("hp: "+m.getHp());
		
		m.location();
		m.move(-5,-4);
		m.move(10, 4);
		m.move(10, 4);
		m.stop();
	}
}
