package Collectiontypes;

import java.util.ArrayList;

public class listdouble {

	public static void main(String[] args) {
		ArrayList<Double> n = new ArrayList<>();
		n.add(10.2);
		n.add(12.4);
		n.add(4.2);
		n.add(5.23);
		n.add(5.89);
		System.out.println(n);
		n.remove(4);
		System.out.println(n);
		System.out.println(n.get(1));
		for(Double x:n)
		{
			System.out.println(x);
		}

	}

}
