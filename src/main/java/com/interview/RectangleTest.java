package com.interview;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		System.out.println("default dimension of rectangle r1 or r2");
		r1.display();
		
		r1.setDimension(5,6);
		r2.setDimension(5,2);
		
		System.out.println("dimension of r1=");
		r1.display();
		
		r2.display();
		
		int a=r1.area();
		System.out.println("area of r1 is="+a);
		
		System.out.println("area of r2 :"+ r2.area());
		
		

	}

}
