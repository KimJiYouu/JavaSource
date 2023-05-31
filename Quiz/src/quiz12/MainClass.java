package quiz12;

public class MainClass {
	public static void main(String[] args) {

		Radio r = new Radio();
		r.setPrice(10000);
		System.out.println(r.getPrice());
		System.out.println(r.getName());
		
		Tv t = new Tv();
		t.setName("Apple");
		System.out.println(t.getName());
	}
}
