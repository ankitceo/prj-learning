package util;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaOperatorTest {

	public static void main(String[] args) {
		System.out.println("-----Lambda Operatotor Test-----");
		MyInterface myInterface = () -> {
			System.out.println("Imlementating display method.");
		};
		myInterface.display();
		
		System.out.println("\n-----Consumer Test-----");
		Consumer<String> consumer1 = (arg) -> {
			System.out.println(arg + "consumer1");
		};

		Consumer<String> consumer2 = (arg) -> {
			System.out.println(arg + "consumer2");
		};
		consumer1.accept("Consumer1 Test - ");
		consumer2.accept("Consumer2 Test - ");
		consumer1.andThen(consumer2).accept("andThen Test - ");
        
		System.out.println("\n-----Supplier Test-----");
		Supplier<String> supplier = () -> {
			return "Returned by Supplier";
		};
		System.out.println(supplier.get());
	}

}

@FunctionalInterface
interface MyInterface {
	void display();
}
