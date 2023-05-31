package day08.encap.obj;

public class Hotel {

//	private Chef chef = new Chef();
	
	private Chef chef;
	
	 // 호텔은 생성될 때 외부에서 chef객체를 받음
	public Hotel() {
		this.chef = new Chef();
	}
	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	// chef의 getter setter 만들기
	// 객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	// 객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
}
