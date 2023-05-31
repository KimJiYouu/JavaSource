package quiz09;

public class ApMain {
	public static void main(String[] args) {
 
		SuperSonicAp ap = new SuperSonicAp("airplane");
		ap.takeOff();
//		ap.flyMode = 0;
		ap.fly();
		ap.flyMode = 1;
		ap.fly();
		System.out.println(ap.info());
		ap.land();
	}
}
