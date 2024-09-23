package Collectiontypes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Queueset1 {

	public static void main(String[] args) {
		/*
		 * set
		 *    not indexed
		 *    will not accept duplicates
		 *    add
		 *    remve
		 *    retrival is not possible
		 *    
		 *    TreeSet:  alphabetical,ascending order
		 *    linkedhashset: insertion order
		 *    hashset: unpredictable order
		 * 
		 * 
		 * */
		
		TreeSet<Integer> t= new TreeSet<>();
		t.add(10);
		t.add(30);
		t.add(90);
		t.add(89);
		t.add(79);
		System.out.println("Tree set is "+t);
		 //remove
		t.remove(10);
		
		System.out.println("after remove 1st set "+t);
		for (int x:t)
		{
			System.out.println(x);
		}
		
		
		LinkedHashSet<Integer> t1 = new LinkedHashSet<>();
		t1.add(10);
		t1.add(30);
		t1.add(90);
		t1.add(89);
		t1.add(79);
		System.out.println("LInkedHashSet set is "+t1);
		
		HashSet<Integer> t2 = new HashSet<>();
		t2.add(10);
		t2.add(30);
		t2.add(90);
		t2.add(89);
		t2.add(79);
		System.out.println("HashSet set is "+t2);
		
		
		
		

	}

}
