package quiz12;

public class Radio extends Product {
	// Radio는 생성자가 1개있고, 가격은 300원, 이름은 맘대로..
	public Radio() {
		super(300, "Sony"); // 부모 클래스의 private변수를 가져올 수 없음
	}
}