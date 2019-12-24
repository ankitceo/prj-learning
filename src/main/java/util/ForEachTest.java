package util;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		myList.add("Five");
		
		myList.forEach(new MyConsumer());
		
		//Using Anonymous Inner Class
		myList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//Using Lambda Operator		
		myList.forEach((arg) -> {
			System.out.println("Consuming: " + arg);
		});
		
	}

}

class MyConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}
