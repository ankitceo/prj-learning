package util;

public class DeadLockTest {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized(obj1) {
					System.out.println("Locked obj1, trying to lock obj2...");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					synchronized(obj2) {
						System.out.println("Successfully locked obj2");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized(obj2) {
					System.out.println("Locked obj2, trying to lock obj1...");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					synchronized(obj1) {
						System.out.println("Successfully locked obj1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
