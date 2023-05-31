package prac;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
        	int a= scan.nextInt();
        	int b = a++;
        	System.out.println(b);
        	System.out.println(a);
        	
        	String k = "a";
        	String j = "a";
        	System.out.println(k.equals(j));
        	
        	char l = 'a';
        	char u = 'a';
        	
        	System.out.println(l == u);
        	
	}

}
