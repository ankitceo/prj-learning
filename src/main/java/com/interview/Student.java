package com.interview;

public class Student {
	int rollno;
	String name;
	static String collegeName;
			
			public Student(int num,String n)
			{
		rollno=num;
		name=n;
			}
			
			static 
			{
				collegeName="Core";
			}
			
	public void display()
	{
		System.out.println(rollno+" "+name+" "+collegeName);
	}
	
	public static void main(String arr[])
	{
		
		Student s1=new Student(111,"Amit");
		Student s2=new Student(121,"Sonu");
		s1.display();
		s2.display();
		
	}

}
