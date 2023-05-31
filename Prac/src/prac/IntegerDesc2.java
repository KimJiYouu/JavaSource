package prac;

import java.util.PriorityQueue;
import java.util.Queue;

public class IntegerDesc2 {

	public static void main(String[] args) {
		
		long answer = 0;
		long n = 118372;
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Queue<Integer> que = new PriorityQueue<>();
       
        
        for(int i  = 0; i < arr.length; i++) {
        	que.offer(Integer.parseInt(arr[i]));
        }
        
        
        int[]arr2 = new int[arr.length];
     
        for(int i = arr.length- 1; i >= 0; i--) {
        	arr2[i] = que.poll();
        }
        
        String s = "";
        for(int i = arr2.length - 1; i >= 0; i--) {
        	s += arr[i];
        }
        
        answer = Long.parseLong(s);     
        
        System.out.println(answer);

	}

}
