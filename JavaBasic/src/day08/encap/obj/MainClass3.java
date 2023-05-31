package day08.encap.obj;

public class MainClass3 {
	public static void main(String[] args) {
		
		Chef chef = new Chef();
		Hotel h = new Hotel(chef);
		
		Chef f = h.getChef();
		f.cooking();
		f.setName("Mina");
		System.out.println(f.getName());
	}
}
