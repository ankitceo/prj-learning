package com.interview;

public class A {
	public static void main()
	{
		System.out.println("it is overloaded main");
		
	}
	public void main(String str)
	{
		
		System.out.println(str);
	
		
	}

	static public void main(String[] args) {
		System.out.println("app started ,invoking overloaded main()");
       main();
       A a=new A();
       a.main("ravi");
       
        System.out.println("app complete");
	}
	
	

}
