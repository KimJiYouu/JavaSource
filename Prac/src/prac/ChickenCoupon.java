package prac;

public class ChickenCoupon {

	public int solution(int chicken) {
		int answer = 0;
		int coupon = 0;
		
		while(chicken > 0) {
			chicken /= 10;
			answer += chicken ;
			coupon += chicken % 10;
			
			if(coupon >= 10) {
				
				answer += chicken;
				coupon = coupon % 10;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		ChickenCoupon c = new ChickenCoupon();
		System.out.println(c.solution(1081));
	}
}
