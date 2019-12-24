package com.interview;

public class Rectangle {


		private int l,b;
	
		
		public void display() {
		
			System.out.println("length="+l);
			System.out.println("breadth="+b);
		}
		public int area() {
			return l*b;
		}
		public void setDimension(int x,int y) {
			l=x;
			b=y;
		}
		

	}



