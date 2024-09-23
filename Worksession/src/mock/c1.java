package mock;

import java.util.HashMap;
import java.util.Scanner;

public class c1 {
	Scanner inp = new Scanner(System.in);	

	public static void main(String[] args) {
		
		c1 ss = new c1();
		c1.details("Siva");
		c1.details(27);
		ss.age();
		ss.display();
		ss.fourno();
		ss.reverse();
		
		HashMap<Float, Boolean> h = new HashMap<>();
		h.put(2.3f, true);
		h.put(2.4f, true);
		h.put(2.5f, false);
	h.put(2.6f, false);
		System.out.println("Hashmap is" +h);

				h.remove(2.3);
				System.out.println("Removed is" +h);
				
				h.get(2.5);
				System.out.println("Get the key" +h);

	}
	public static void details(String name)
	{
		System.out.println("Name is:" + name);
	}
	public static void details(int age)
	{
		System.out.println("Age is: "+ age);
	}
	public void small(int n1, int n2)
	{
		
		if (n1>n2)
		{
			System.out.println("N2 is Small:" +n2);
		}else if (n2>n1)
		{
			System.out.println("N1 is Small:" +n1);
		}
		
	}
	public void display()
	{
		String s1 = "How are you";
		int n1 = 1;
		do
		{
			System.out.println(s1);
			n1++;
		}while (n1<=10);
	}
	public void age()
	{
		System.out.println("Enter age:");
		int ag = inp.nextInt();
		if (ag<18)
		{
			System.out.println("MInor");
		}
		else if(ag>=18)
		{
			System.out.println("Major");
		}
	}
public void fourno()
{
	System.out.println("Enter four no's to find its product");
	int f1 = inp.nextInt();
	int f2 = inp.nextInt();
	int f3 = inp.nextInt();
	int f4 = inp.nextInt();
	System.out.println("Result of 4 multiples is :" +f1*f2*f3*f4);
}
public void reverse()
{
	String s = "Bye see you";
	
	String reversedString = new StringBuilder(s).reverse().toString();

    String modifiedString = reversedString.replace("eyb ", "hi");
    System.out.println(modifiedString);
		
}
	

}
