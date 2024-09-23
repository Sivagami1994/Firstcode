package Collectiontypes;

import java.util.ArrayList;

public class list1 {

	public static void main(String[] args) {
		/*list, queue, set, map, table
		 * 
		 * queue
		 *    not indexed 
		 *    add 
		 *    remove
		 *    retrive  onlty head
		 *    iterate
		 *    accept duplicates too
		 *    size limitation
		 *    
		 *   
		 *    
		 *    int=> Integer
		 *    String=> String
		 *    double=> Double
		 *    float-> Float
		 *  
		 */
		
		ArrayList<Integer> n = new ArrayList<>();
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(5060);
		n.add(50);
		System.out.println(n);
		n.remove(3);
		System.out.println(n);
		System.out.println(n.get(1));
		for(int x:n)
		{
			System.out.println(x);
		}
		
		
		
		
		

	}

}
