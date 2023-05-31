package quiz13;

public class Circle extends Shape{
// 원은 radius변수를 가짐
// 원은 생성될 때 이름과, radius를 받을 수 있도록 생성자 선언
// getArea() = 원의 넓이를 구하도록 오버라이딩
	
	public int radius;
	
	public Circle(String name, int radius) {
		super(name); // 부모 클래스의 private 변수로 연결하기
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*PI;
	}
}
