package com.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();

		hs.add("India");
		hs.add("China");
		hs.add("Bhutan");
		hs.add("Afganistan");
		hs.add("Nepal");

		System.out.println("hash set contents");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Adding hashset elements to a treeSet");
		TreeSet<String> ts = new TreeSet();
		ts.addAll(hs);

		System.out.println("tree set contents");
		itr = ts.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("trying to add India again to the treeset");
		if (ts.add("India"))
			System.out.println("added");
		else
			System.out.println("not added");

	}

}
