package util;

public class Student {
	
	private int rollNum;
	private String name;
	
	
	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.rollNum;
	}
	
	@Override
	public boolean equals(Object s) {
		return (this.rollNum == ((Student)s).rollNum);
	}
	
	@Override
	public String toString() {
		return "Student" + this.rollNum;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
