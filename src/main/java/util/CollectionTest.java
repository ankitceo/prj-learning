package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Ankit1");
		hashMap.put(2, "Ankit2");
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		hashMap.forEach((K, V) -> {
			System.out.println(K + " : " + V);
		});
		
		Set<Integer> keySet = hashMap.keySet();
		keySet.forEach(key -> {
			System.out.println(key + " : " + hashMap.get(key));
		});
		
		for(Integer key : keySet) {
			System.out.println(key + " : " + hashMap.get(key));
		}
		
	}

}
