package Constructor;

public class const1 {

	public static void main(String[] args) {
		const1 c1 = new const1();
		c1.big4();
		c1.table7();
		c1.positive();
		c1.parallefram();
		c1.sele5();
		c1.even();
		c1.div();
		c1.rev();
		average();
		new const1(9.12f);

	}
	public const1()
	{
		System.out.println("1.This contructor is to print Address- VRS nager, Coimbatore");
		int i=9;
		int j=2;
		int res = i/j;
		System.out.println("last step: print divsion of 9 and 2 in default constructor "+res);
		
	}
	public void big4()
	{
		int n1 =10;
		int n2 =20;
		int n3 =30;
		int n4 =90;
		System.out.println("2.Print the biggest from 4 no given as 10, 20,30,90");
		int big =n1;
		if (n2>big)
		{			
			big =n2;
		}
		if(n3>big)
		{
		big =n3;
		}
		if(n4>big)
		{
		big =n4;
		}
		System.out.println("biggest no is :"+big);
		}
	public void table7()
	{
		int t=70;
		System.out.println("3.printing 7th table using for loop :"+t);
		for(int i=0;i<=70;i++)
		{
			if (t%7==0 && t>=7)
			{
			System.out.println(+t);
			t=t-7;
			}
		}
	}
	public void positive()
	{
		int p=-1;
		System.out.println( (p>0)?"4.Positive":(p<0)?"4.Negative" : "4.Zero");
	}
	public void parallefram()
	{
		int b=9;
		int h=9;
		System.out.println("5.Area of paralleogram :" +b*h);
	}
	public void sele5()
	{
		String s ="Selenium";
		int s1=5;
		System.out.println("6.Printing Selenium 5times:");
		while(s1>=0)
		{
			System.out.println("Selenium");
			s1--;
		}
	}
	public void even()
	{
		int ev=7;
		if (ev%2==0)
		{
			System.out.println("7.give no is even:"+ev);
		}
		else if (ev%2!=0)
		{
			System.out.println("7.given no is odd :"+ev);
		}
	}
	public void div()
	{
		int d=40;
		System.out.println("8.Print given no is divisible by 5 or not");
		if (d%5 == 0)
		{
			System.out.println("given no "+d+" is divisible 5 ");
		}
		else
		{
			System.out.println("Not divisible"+d);
		}
	}
	public void rev()
	{
		int r=80;
		System.out.println("9.Printing 8th table in reverse using do while");
		do
		{
			System.out.println( +r);
			r=r-8;			
		}while(r>=0);
	}
	public static void average()
	{
		int n1 = 2;
		int n2 =9;
		int n3 =3;
		int n4 =8;
		int n5 =12;
		System.out.println("10.Average is " +(n1+n2+n3+n4+n5/5));
	}
	public const1( float r)
	{
		System.out.println("11.Area of semicircle " +(2*3.14f*r));
	}
	}
