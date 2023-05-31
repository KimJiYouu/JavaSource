package day08.encap.obj;

public class MainClass4 {
	public static void main(String[] args) {
		
		Hotel h = new Hotel(new Chef());
		
		Chef f = h.getChef();
		f.cooking();
		
		f.setName("Dracula");
		System.out.println(f.getName());
	}
}
