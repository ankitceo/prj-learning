package util;

public class ExceptionDemo {

	public static void main(String[] args) {
		/*try {
			throw new Ex1();
		} catch (Ex0 ex) {
			System.out.println("Ex0 caught.");
		} catch (Exception ex) {
			System.out.println("Exception caught.");
		}*/
		
		try {
			badMethod();
		} catch (Error e) {
			System.out.println("Error caught.");
		} catch (Exception e) {
			System.out.println("Error caught.");
		}
		finally {
			System.out.println("finally Printed.");
		}

	}
	
	public static void badMethod() throws Error {
		throw new Error();
	}

}
