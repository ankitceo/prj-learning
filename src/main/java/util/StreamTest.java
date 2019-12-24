package util;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i = 0; i <= 100; i++) {
			myList.add(i);
		}
		
		Supplier<Stream<Integer>> seqStreamSupplier = () -> myList.stream();
		seqStreamSupplier.get().filter(p -> p > 50).forEach(num -> {
			System.out.println(num);
		});
		
		Supplier<Stream<Integer>> paraStreamSupplier = () -> myList.parallelStream();
		paraStreamSupplier.get().filter(p -> p > 50).forEach(num -> {
			System.out.println(num);
		});
		
		int number = 73;
	    System.out.println(number > 1 && IntStream.range(2, number).noneMatch(p -> number % p == 0));
	}

}
