package Collectiontypes;

import java.util.ArrayList;

public class listchar {

	public static void main(String[] args) {
		ArrayList<Character> n = new ArrayList<>();
		n.add('1');
		n.add('e');
		n.add('t');
		n.add('t');
		n.add('s');
		System.out.println(n);
		n.remove(3);
		System.out.println(n);
		System.out.println(n.get(1));
		for(char x:n)
		{
			System.out.println(x);
		}

	}

}
