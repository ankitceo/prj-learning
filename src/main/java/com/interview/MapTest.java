package com.interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String arr[]) {

		HashMap<String, String> map = new HashMap();
		TreeMap<String, String> treeMap = new TreeMap();

		map.put("India", "New Delhi");
		map.put("China", "Bejing");
		map.put("Bhutan", "Thimpu");
		map.put("Afganistan", "Kabul");
		map.put("Nepal", "Kathmandu");

		System.out.println("Hash Map Contents:");
		Set<Entry<String, String>> entrySet = map.entrySet();

		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		treeMap.putAll(map);
		
		System.out.println("Tree Map Contents:");
		entrySet = treeMap.entrySet();

		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// Use of keyset
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
				
		
		/*int[] rollNumArray = {1, 2, 3, 4, 5};
		for(int rollNum : rollNumArray) {
			System.out.println(rollNum);
		}*/

	}

}
