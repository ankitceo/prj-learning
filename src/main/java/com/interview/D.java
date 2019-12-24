package com.interview;

class D2 {
	static
	{
		System.out.println("A is initialized");
	}
	public static void display()
	{
		System.out.println("display() of A is invoked");
	}

}

class B{
	static {
		System.out.println(" B is initialized");
	}
	public B()
	{
		System.out.println("object of B is inititalized");
	}
}

class C
{
	static int value;
	static
	{
		value=5;
		System.out.println("c is initialized");
		
	}
}


class D
{
	static
	{
		System.out.println("D is initilized");
	}
	
	public static void main(String arr[])
	{
		System.out.println("invoking static block of D");
		D2.display();
		System.out.println("creating object of B");
		B x=new B();
		System.out.println("c.value is: "+C.value);
		System.out.println("creating another object of B");
		B y=new B();
		
	}
}

