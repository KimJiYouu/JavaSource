package quiz05;

public class Computer extends Calculator {
	
	// overriding
	double circle(int a) {
		
		return Math.PI*a*a;
	}
	
	// overloading
	double rect(double a) {
		return a*a;
	}
	double rect(double a, double b) {
		return a*b;
	}
	double rect(double a, double b, double c) {
		return (a*b + a*c + b*c)*2;
	}
}
