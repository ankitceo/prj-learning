package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class OrderSorter {

	public static void main(String... args) {
		int[][] orders = { { 5, 6 }, { 8, 2 }, { 3, 4 }, { 4, 7 } };

		HashMap<Integer, Integer> ordersMap = new HashMap<>();

		for (int i = 0; i < orders.length; i++) {
			ordersMap.put(i + 1, orders[i][0] + orders[i][1]);
		}

		ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(ordersMap.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if (o1.getValue() != o2.getValue()) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getKey().compareTo(o1.getKey());
				}
			}
		});
		
		int[] result = new int[list.size()];
		
		int i = 0;
		for(Entry<Integer, Integer> entry : list) {
			result[i] = entry.getKey();
			i++;
		}

		System.out.println(Arrays.toString(result));
	}

}
