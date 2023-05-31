package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		
		Shape c = new Circle("동그리", 3);
		System.out.println("원의 넓이: "+c.getArea());
		System.out.println(c.getName());
		
		Shape r = new Rect("네모네모", 4);
		System.out.println("사각형의 넓이: "+r.getArea());
		System.out.println(r.getName());
	}
}
