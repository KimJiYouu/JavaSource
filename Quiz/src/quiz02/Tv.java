package quiz02;

public class Tv {

	String company = "LG"; // 회사
	int channel; // 채널
	boolean power; // 전원
	
	/*
	 * 메서드>
	 * changeChannel : int - 매개변수 x번을 받아서 채널을 변경, 채널 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지게 동작
	 */
	
	int changeChannel(int x) {
		channel = x;
		return channel;
	}
	void power() {
		if(power == true) {
			power = false;
			System.out.println("off");
		} else {
			power = true;
			System.out.println("on");
		}
	}
}
