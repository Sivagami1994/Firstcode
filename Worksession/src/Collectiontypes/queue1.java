package Collectiontypes;

//import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class queue1 {

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
		ArrayBlockingQueue<Double> n = new ArrayBlockingQueue<>(4);
		n.add(2.2);
		n.add(2.3);
		n.add(2.4);
		n.add(2.5);
		System.out.println(n);
		n.remove(2.5);
		System.out.println(n);
		System.out.println("element is: "+n.peek());
		for(double x:n)
		{
			System.out.println(x);
		}

	}

}
