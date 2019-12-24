package com.interview;

public class Swapper {
	static int a=4,b=6;
	public static void swap()
	{
		int x;
		x=a;
		a=b;
		b=x;
	}

	public static void main(String[] args) {
	
		System.out.println(a+"\n"+b);
		Swapper.swap();
		System.out.println("afte swapping:");
		System.out.println(a+"\n"+b);
		

	}

}
