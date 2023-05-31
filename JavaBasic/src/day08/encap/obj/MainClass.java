package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {

//		Hotel h = new Hotel();
		
		Chef ch = new Chef();
		Hotel hh = new Hotel(ch);
		
		Hotel hhh = new Hotel(new Chef());
		
		Chef c = hh.getChef(); // Hotel안에 있는 Chef를 꺼냄
		// 반환유형을 확인하기
		System.out.println(c == ch);

		c.cooking();

//		Chef를 생성해서 Hotel한테 전달
//		Chef chef = new Chef();
//		h.setChef(chef);
		hh.setChef(new Chef());

		Chef cc = hh.getChef(); // Hotel안에 있는 Chef를 꺼냄
		cc.cooking();
		cc.setName("Lola");
		System.out.println(cc.getName());

		Chef f = new Chef();
		f.cooking();
		f.setName("Don");
		System.out.println(f.getName());
	}
}
