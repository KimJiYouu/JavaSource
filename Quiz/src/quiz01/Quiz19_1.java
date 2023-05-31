package quiz01;

import java.util.Scanner;

public class Quiz19_1 {
	public static void main(String[] args) {

		int[] arr = { 1000, 500, 100, 50, 10 };

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
        int num = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	num = x/arr[i];
        	System.out.println(arr[i] + "원 : "+num);
        	x %= arr[i];
        }
	}
}
