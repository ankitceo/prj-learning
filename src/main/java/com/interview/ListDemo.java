package com.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();

		// Adding some of elements to the list
		list.add("first");
		list.add("third");
		list.add("fifth");

		// Inserting some elements to the list
		list.add(1, "second");
		list.add(3, "fourth");
		
		System.out.println(list.size());
		

		// Obtaining the iterator of the list
		Iterator<String> itr = list.iterator();
		System.out.println("list elements in the order of insertion..");
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("list elements in the reverse order..");
		ListIterator litr = list.listIterator(list.size());
		while (litr.hasPrevious())
			System.out.println(litr.previous());
		System.out.println("removing second element from the list");
		list.remove("second");

		System.out.println("current size of the list is:" + list.size());

		System.out.println("searching fourth element in the list");
		;
		if (list.contains("fourth"))
			System.out.println("found");
		else
			System.out.println("not found");
		
	

	}

}
