package com.interview;

public class Emp {
	private String name;
	private String job;
	private double salary;
	
	
	public Emp(String n,String j,double s) {
		name=n;
		job=j;
		salary=s;
	}
	
	public void display()
	{
		System.out.println("name="+name+"job="+job+"salary="+salary);
		
	}
	
	public void increaseSalaryBy(int amount)
	{
		salary=salary+amount;
		
	}

}
