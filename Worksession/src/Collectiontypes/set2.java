package Collectiontypes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class set2 {

	public static void main(String[] args) {
		
		TreeMap<Double, Character>t = new TreeMap<>();
		t.put(2.3, 'a');
		t.put(2.4, 'b');
		t.put(2.5, 'c');
		t.put(2.6, 'd');
		System.out.println("TreeMap" +t);
		
		LinkedHashMap<Double, Character>t2 = new LinkedHashMap<>();
		t2.put(2.3, 'a');
		t2.put(2.4, 'b');
		t2.put(2.5, 'c');
		t2.put(2.6, 'd');
		System.out.println("TreeMap" +t2);
		
		HashMap<Double, Character>t3 = new HashMap<>();
		t3.put(2.3, 'a');
		t3.put(2.4, 'b');
		t3.put(2.5, 'c');
		t3.put(2.6, 'd');
		System.out.println("TreeMap" +t3);
		
		
				}

}
