package MethodOverloading;

public class MethodOverloading {

	public static void add(int a, double b) {
		System.out.println("First method called " + (a+b));
	}
	
	public static void add(double a, int b) {
		System.out.println("Second method called " + (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Third method called " + (a+b+c));
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println("Fourth method called " + (a+b+c+d));
	}
	
	public static void main(String[] args) {
//		MethodOverloading.add(1, 1);
//		MethodOverloading.add(12.43, 1);
		MethodOverloading m = new MethodOverloading();
		m.add(1, 2, 3);
		m.add(1, 2, 3, 4);
	}
}
