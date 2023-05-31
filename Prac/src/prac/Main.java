package prac;


public class Main {
	
	
	   public static void solution(String s) {
		   String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		   String[] arr2 = {"0","1","2","3","4","5","6","7","8","9"};
		   for(int i = 0; i < arr.length; i++) {
			   if(s.contains(arr[i])) {
				   s = s.replace(arr[i], arr2[i]);
			   }
		   }
		   
	        int answer = 0;
	        answer = Integer.parseInt(s);
	       System.out.println(answer);
	    }


	   public static void main(String[] args) {
		Main m = new Main();
		solution("one2three");
	}

}
