package Collectiontypes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map
		 *    container  where elements will be stored along with its key
		 *    key: any datatype
		 *    element: any datatype
		 *    
		 *    add
		 *    remove
		 *    retrieve
		 *    
		 *    TreeMap            : keys:   alphabetical/ascendinf order
		 *    LinkedHashMap     : keys:  insertion order
		 *    HashMap           : keys: unpredictab;e order
		 *    
		 *    TreeMap<datatypeokey, datatypeofelement> name= new TreeMap<>();
		 * 
		 * 
		 * 
		 * 
		 * */

		TreeMap<Double, Character>t = new TreeMap<>();
		t.put(2.3, 'a');
		t.put(2.4, 'c');
		t.put(2.5, 'd');
		t.put(2.6, 'b');
		System.out.println("TreeMap" +t);
		//remove the keys
		t.remove(2.3);
		System.out.println("Removed is" +t);
		//retrive the keys
		t.get(2.5);
		System.out.println("Removed is" +t);
		
		
		
		LinkedHashMap<Double, Character>t2 = new LinkedHashMap<>();
		t2.put(2.3, 'a');
		t2.put(2.4, 'd');
		t2.put(2.5, 'c');
		t2.put(2.6, 'b');
		System.out.println("linked HashMap is:" +t2);
		//remove the keys
				t.remove(2.3);
				System.out.println("Removed is" +t2);
				//retrive the keys
				t.get(2.5);
				System.out.println("Get the key" +t2);
		
		HashMap<Double, Character>t3 = new HashMap<>();
		t3.put(2.3, 'a');
		t3.put(2.4, 'b');
		t3.put(2.5, 'c');
		t3.put(2.6, 'd');
		System.out.println("Hashmap is" +t3);
		//remove the keys
				t.remove(2.3);
				System.out.println("Removed is" +t3);
				//retrive the keys
				t.get(2.5);
				System.out.println("Get the key" +t3);
				
				Hashtable<Double, Character>t4 = new Hashtable<>();
				t4.put(2.3, 'a');
				t4.put(2.4, 'b');
				t4.put(2.5, 'c');
				t4.put(2.6, 'd');
				System.out.println("Hashtable is" +t4);
				//remove the keys
						t.remove(2.3);
						System.out.println("Removed is" +t4);
						//retrive the keys
						t.get(2.5);
						System.out.println("Get the key" +t4);
	}

}
