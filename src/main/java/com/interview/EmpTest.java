package com.interview;

public class EmpTest {

	public static void main(String[] args) {
		Emp e1=new Emp("amit "," er ", 50000);
		Emp e2=new Emp("sonu" ," sa ", 25000);
		e1.display();
		e2.display();
		e1.increaseSalaryBy(5000);
		e2.increaseSalaryBy(5000);
		e1.display();
		e2.display();
				

	}

}
