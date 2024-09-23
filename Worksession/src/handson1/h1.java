package handson1;

import java.util.Scanner;

public class h1 {
 public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
h1.odd();
h1.rectuser();
h1.substring1();
	}
public static void odd()
{
	System.out.println("Enter the number from 11 to 23 and let me guess given no is odd or even:");
	int od = input.nextInt();
	if (od%2 ==0)
			{
		System.out.println("Given no is even:"+od);
			}
	else
	{
		System.out.println("Given no is odd:" +od);
	}
}
public static void rectuser()
{
	System.out.println("Enter the length and breadth:");
	int l= input.nextInt();
	int b= input.nextInt();
	System.out.println("Area of rectangle:"+l*b);
	
}
public static void substring1()
{
	StringBuffer n = new StringBuffer("hi how are you raji");
	System.out.println("Length of string is :"+ n.length());
	System.out.println("Substring of YOU is:" +n.substring(11, 14));
	System.out.println("Reverse string:"+ n.reverse());
	
}
	
}
