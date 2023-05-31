package day10.abstract_good;

public class SeoulStore extends Store{

	@Override
	public void apple() {
		System.out.println("서울지점 사과 500원");
	}

	@Override
	public void grapes() {
		System.out.println("서울지점 포도 600원");
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지 700원");		
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론 800원");		
	}
	
	public void k() {
		System.out.println("안녕");
	}
	
	// ctrl + space 를 통해서도 override해야 할 메서드 확인 가능
}
