package quiz13;

public abstract class Shape { // 부모클래스

	public static final double PI = 3.14;
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
//	overriding 필요함
	public abstract double getArea(); // 넓이

//	name의 getter
	public String getName() {
		return "도형이름: "+name;
	}
}
