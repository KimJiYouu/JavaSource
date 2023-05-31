package quiz04;

public class WizardWarriorMain {
	public static void main(String[] args) {

		Wizard wiz = new Wizard("Elphaba");

		wiz.info();
		wiz.iceArrow();
		System.out.println("현재mp: " + wiz.mp);
		wiz.iceArrow();
		System.out.println("현재mp: " + wiz.mp);

		System.out.println("==========");
		Warrior mon = new Warrior("Glinda");

		mon.bash();
		mon.info();
	}
}
