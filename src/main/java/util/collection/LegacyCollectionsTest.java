package util.collection;

import java.util.Hashtable;
import java.util.Vector;

public class LegacyCollectionsTest {

	public static void main(String[] args) {
		int[] array = new int[1];
		Vector<Integer> vector = new Vector<>();
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		array[0] = 1;
		vector.addElement(1);
		ht.put("element", 1);
		
		System.out.println(array[0]);
		System.out.println(vector.elementAt(0));
		System.out.println(ht.get("element"));
	}

}
