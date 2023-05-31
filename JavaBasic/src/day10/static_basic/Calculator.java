package day10.static_basic;

public class Calculator {
	
//	클래스 설계를 할 때, 적절한 곳에 static 을 붙이면 좋음
//	객체마다 다른 값을 가져야 하면 일반변수,
//	객체마다 동일한 값을 가져야 하면 static 변수가 됨
	
	private String color;
	public static double pi = 3.14;
	
	
//	메서드
//	일반멤버변수(this 포함)를 사용하는 메서드(getter/ setter)는 static이면 안됨
	public void setColor(String color) {
		this.color = color;  
	}
	
	public String getColor() {
		return color;
	}
	
//	일반멤버변수를 사용하지 않고 외부에서 범용성있게 사용할 메서드는 static을 붙여도 됨
	public static double circle(int r) {
		return r*r*Math.PI;
	}
}
