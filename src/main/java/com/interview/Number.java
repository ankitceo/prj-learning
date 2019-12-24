package com.interview;

public class Number {
	int value;
	
	public Number(int x)
	{
		value =x;
	}
	public void display() {
		System.out.println("value is="+value);
	}
	public void  doubleIt()
	{
		value= value*2;
	}

}
