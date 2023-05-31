package day08.encap.obj;

public class MainClass2 {
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		Chef ff = h.getChef();
		ff.cooking();
		
		ff.setName("Lola");
		System.out.println(ff.getName());
	}
}
