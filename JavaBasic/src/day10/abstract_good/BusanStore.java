package day10.abstract_good;

public class BusanStore extends Store{

	@Override
	public void apple() {
		System.out.println("부산지점 사과 200원");		
	}

	@Override
	public void grapes() {
		System.out.println("부산지점 포도 300원");		
	}

	@Override
	public void orange() {
		System.out.println("부산지점 오렌지 400원");		
	}

	@Override
	public void melon() {
		System.out.println("부산지점 멜론 500원");		
	}
	public void j() {
		System.out.println("hi");
	}
}
