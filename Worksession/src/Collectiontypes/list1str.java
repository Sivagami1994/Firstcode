package Collectiontypes;

import java.util.ArrayList;

public class list1str {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();
		n.add("Hi");
		n.add("Hello");
		n.add("Welcome");
		n.add("bye");
		n.add("fine");
		System.out.println(n);
		n.remove(3);
		System.out.println(n);
		System.out.println(n.get(1));
		for(String x:n)
		{
			System.out.println(x);
		}

	}

}
