package Overaloding;

public class handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
handson.small(21,9);
handson.smallest(12,2,1);
	}
	public static void small(int a, int b)
	{
		
		if (a>b)
		{
			System.out.println("B is smallest no:"+b);
		}
		else if(b>a)
		{
			System.out.println("A is smallest no: "+a);
		}
		else if(a==b)
		{
			System.out.println("both A and B are same "+a);
		}
	}
	public static void smallest(int a, int b, int c)
	{
		if (a<b && a<c)
		{
			System.out.println("A is smallest no: "+a);
		}
		if (b<a && b<c)
		{
			System.out.println("b is smallest no: "+b);
		}
		if (c<a && c<b)
		{
			System.out.println("c is smallest no: "+c);
		}
	}

}
