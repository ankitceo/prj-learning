package util;

public class Singleton {
	private static int objCount;
	private static Singleton obj;
	
	private Singleton() {
		objCount++;
	}
	
	public static Singleton getObject() {
		if(objCount < 1) {
			obj = new Singleton();
		}
		return obj;
	}

}
