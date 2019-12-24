package com.interview;

public class Ticket {
	//object attributes
	private int no, value;
	
	private static int counter,totalValue;
	
	static
	{
		counter=0;
		totalValue=0;
		
	}
	//object initilize
	 public Ticket(int v)
	 {
		 value =v;
		 totalValue=totalValue+value;
		 no=++counter;
		 
	 }
	 public void display()
	 {
		 
	 }

}
