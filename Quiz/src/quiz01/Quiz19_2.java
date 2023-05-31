package quiz01;

import java.util.Scanner;

public class Quiz19_2 {
	public static void main(String[] args) {
		
		int[] arr = {1000,500,100,50,10};

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = 0;
		int i = 0;
		while(i<arr.length) {
//				x/arr[0] // 몫	
//				x%arr[0]/arr[1]
//				x%arr[1]/arr[2]
//				x%arr[2]/arr[3]
//				x%arr[3]/arr[4]		
			
			   y = x/arr[i];			
			   x = x%arr[i];
					   
		}
	}
}
