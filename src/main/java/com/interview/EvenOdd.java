package com.interview;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		try {
		System.out.println("enter num=");
		int num=Integer.parseInt(args[0]);
		
		
		if(num%2==0)
			System.out.println("even num");
		else
			System.out.println("odd num");
	}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
	
