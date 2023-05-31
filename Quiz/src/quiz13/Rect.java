package quiz13;

public class Rect extends Shape{
// 사각형은 side변수를 가짐
// 사각형은 생성될 때 이름과, side를 받을 수 있도록 생성자 선언
// getArea() = 사각형의 넓이를 구하도록 오버라이딩

	public int side;
	
	public Rect(String name, int side) {
		super(name); // 부모 클래스의 private 변수로 연결하기
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
}
