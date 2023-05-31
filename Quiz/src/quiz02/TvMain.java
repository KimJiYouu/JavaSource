package quiz02;

public class TvMain {
	public static void main(String[] args) {

		Tv abc = new Tv();

		int channel = abc.changeChannel(6);
		System.out.println("변경된 채널: " + channel);

		abc.power();
		abc.power();
		abc.power();
	}
}
