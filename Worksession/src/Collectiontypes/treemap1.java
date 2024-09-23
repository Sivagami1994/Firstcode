package Collectiontypes;

import java.util.TreeMap;

public class treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	TreeMap<Integer, Double>t = new TreeMap<>();
	t.put(2, 2.5);
	t.put(3, 3.5);
	t.put(4, 4.5);
	t.put(5, 5.5);
	System.out.println("TreeMap" +t);
	//remove the keys
	t.remove(5);
	System.out.println("Removed is" +t);
	//retrive the keys
	t.get(2);
	System.out.println("Removed is" +t);

}
}

