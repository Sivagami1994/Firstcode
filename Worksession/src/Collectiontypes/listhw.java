package Collectiontypes;

import java.util.ArrayList;

public class listhw {

	public static void main(String[] args) {
		ArrayList<Float> n = new ArrayList<>();
		n.add(20f);
		n.add(30f);
		n.add(40f);
		n.add(5060f);
		n.add(50f);
		System.out.println(n);
		n.remove(3);
		System.out.println(n);
		System.out.println(n.get(1));
		for(float x:n)
		{
			System.out.println(x);
		}

	}

}
