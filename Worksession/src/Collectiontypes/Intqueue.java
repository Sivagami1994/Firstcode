package Collectiontypes;

import java.util.concurrent.ArrayBlockingQueue;

public class Intqueue {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> n = new ArrayBlockingQueue<>(4);
		n.add(2);
		n.add(0);
		n.add(2);
		n.add(4);
		System.out.println(n);
		n.remove(2);
		System.out.println(n);
		System.out.println(n.peek());
		for(int x:n)
		{
			System.out.println(x);
		}


	}

}
