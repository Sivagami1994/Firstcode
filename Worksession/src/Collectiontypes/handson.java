package Collectiontypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;

public class handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
handson.flist();
handson.dqueue();
handson.inthashset();
	}
	public static void flist()
	{
		ArrayList<Float> n = new ArrayList<>();
		n.add(20.2f);
		n.add(30.3f);
		n.add(40.4f);
		n.add(50.5f);
		n.add(50.6f);
		System.out.println("Float list are:"+n);
		n.remove(3);
		System.out.println("Removed 3rd no:"+n);
		System.out.println("diplaying 1st no:"+n.get(1));
		for(float x:n)
		{
			System.out.println("Iterations:"+x);
		}
	}
	
	public static void dqueue()
	{
		ArrayBlockingQueue<Double> n = new ArrayBlockingQueue<>(4);
		n.add(2.2);
		n.add(2.3);
		n.add(2.4);
		n.add(2.5);
		System.out.println("****Double queue is**** "+n);
		n.remove(2.5);
		System.out.println("removed 2.5 from queue: "+n);
		System.out.println("Fetch queue's: "+n.peek());
		for(double x:n)
		{
			System.out.println("Iterate queue:"+x);
		}
		}
	public static void inthashset()
	{
		HashSet<Integer> n = new HashSet<>();
		n.add(10);
		n.add(30);
		n.add(90);
		n.add(89);
		n.add(79);
		System.out.println("****HashSet set is**** "+n);
		n.remove(90);
		System.out.println("HashSet removed is: "+n);
		
		for(int x:n)
		{
			System.out.println("Iterate hashset:"+x);
		}
		
		HashMap<Integer, Character>h = new HashMap<>();
		h.put(2, 'a');
		h.put(3, 'b');
		h.put(4, 'c');
		h.put(5, 'd');
		System.out.println("****HashMap is****" +h);
		h.remove(5);
		System.out.println("Removed is" +h);
		h.get(4);
		System.out.println("Get the key" +h);
		
		TreeMap<Double, String>t = new TreeMap<>();
		t.put(2.3, "one");
		t.put(2.4, "two");
		t.put(2.5, "three");
		t.put(2.6, "four");
		System.out.println("***TreeMap****" +t);
		t.remove(2.3);
		System.out.println("Removed is: " +t);
		t.get(2.5);
		System.out.println("Fetched is: " +t);
		
	}
	

}
