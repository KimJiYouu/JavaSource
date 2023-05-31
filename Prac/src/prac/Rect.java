package prac;

public class Rect {
    public int solution(int[][] dots) {
        int answer = 0;
        int length1 = 0;
        int length2 = 0;
    
        
        for(int i = 1; i < dots.length; i++) {
        	 if(dots[0][0] == dots[i][0]) {
        		 length1 = Math.abs(dots[0][1] - dots[i][1]);
        		
        	 }
        } 
        
        
        answer = length1 * length2;
        
        return answer;
    }
    
    public static void main(String[] args) {
		Rect r = new Rect();
		System.out.println(r.solution(null));
	}

}
