package util;

public class OverloadDemo {

	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		System.out.println(obj.sum(1,2,3,4));
		obj.sub(1);

	}
	
	public int sum(int a) {
		return 1;
	}
	
	public int sum(int a, int b) {
		return 2;
	}
	
	public int sum(int ... a) {
		return 3;
	}

	public void sub(byte a) {
		System.out.println("byte");
	}
	public void sub(short a) {
		System.out.println("short");
	}
	public void sub(int a) {
		System.out.println("int");
	}
	public void sub(long a) {
		System.out.println("long");
	}
	public void sub(float a) {
		System.out.println("float");
	}
	public void sub(double a) {
		System.out.println("double");
	}
	
	public void sub(String a) {
		
	}

}

/*
Overloading condition:
1. Method name should be same
2. arg type or no. or args should be different
*/
