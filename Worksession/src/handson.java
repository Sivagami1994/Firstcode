public class handson {

	public static void main(String[] args)
	{
		System.out.println("Area of sphere"+sphere());
		System.out.println("Area of perimeter"+peri());
		handson.average();
		System.out.println("Product: "+product());
		handson s1 = new handson();
		System.out.println("Area of hemisphere: "+s1.Ahemis());
		s1.details();
		handson.semicircle();
		handson.rectangle();
		handson.average3();
		handson.product(6,5,4);
		System.out.println("Area of hemisphere: "+handson.areaS()+"\n");
		System.out.println("Details:Name Age and place:"+handson.info("Siva", "27", "CBE"));//how to print with space here 
		handson.reverse();
		handson.odd();
		handson.even();
		handson.odd1();
		handson.reverse1();
		handson.even2();
		handson.table();
		handson.div();

	}
	public static float sphere()
	{
		return (4*3.14f*3.14f);
	}
	public static float peri()
	{
		float a=9.7f;
		return 4*a;
	}
	public static void average()
	{
		int n1 = 2;
		int n2 =9;
		int n3 =3;
		int n4 =8;
		int n5 =12;
		System.out.println("Average is" +(n1+n2+n3+n4+n5/5));
	}
	public static int product()
	{
		int m1=2;
		int m2=3;
		int m3=4;
		return(m1*m2*m3);
	}
	public float Ahemis()
	{
		float r=9.5f;
		return (3*3.14f*r*r);
	}
	public String details()
	{
		return("Cooking, height is 5.55, weight is 56 kg");
	}
	public static void semicircle()
	{
		float r=8;
		float pi=3.14f;
		System.out.println("Area of semicircle" +(2*pi*r));
	}
	public static void rectangle()
	{
		float l=2.3f;
		float b=3.4f;
		System.out.println("Area of rectangle" +(2*(l+b)));
	}
	public static void average3()
	{
		double s1=12;
		double s2=13;
		double s3=10;
		System.out.println("Average of 3 No's:" +(s1*s2*s3/3));
	}
	public static void product(int p1,int p2, int p3)
	{
		System.out.println("product of 3 No's:" +(p1*p2*p3));
	}
	public static float areaS()
	{
		float r=9;
		return (3.14f*r);
	}
	public static String info(String name, String age, String address)
	{
		return(name +""+ age+"" +address+"");
 
	}
	public static void reverse()
	{
		int r=90;
		System.out.println("Printing 9th table:");
		while(r>=0)
		{
			System.out.println( +r);
			r=r-9;			
		}
	}
	public static void odd()
	{
		int o=7;
		System.out.println("Odd No's from 7 to 17 using FOR loop:");
		for(int i=0; i<=5; i++)//here used 5 as condition as till 5th occurence no should print
		{
			System.out.println(+o);
			o=o+2;
		}
	}
		public static void even()
		{
			int ev=30;
			System.out.println("Odd No's from 30 to 40 do while loop:");
			do
			{
				System.out.println(+ev);
				ev=ev+2;
			}while(ev<=40);
	}
	public static void odd1()
	{
		int e=5;
		System.out.println("Odd No's from 5 to 55 using while loop:");
		while(e<=55)
		{
			System.out.println( +e);
			e=e+2;
		}
		
	}
	public static void reverse1()
	{
		int r=90;
		System.out.println("Printing 9th table in reverse using do while");
		do
		{
			System.out.println( +r);
			r=r-9;			
		}while(r>=0);
	}
	public static void even2()
	{
		int e1=70;
		System.out.println("Odd No's from 70 to 80 using FOR loop:");
		for(int i=0; i<=5; i++)//here used 5 as condition as till 5th occurence no should print
		{
			System.out.println(+e1);
			e1=e1+2;
		}
	}
	public static void div()
	{
		int d=9;
		System.out.println("Print given no is divisible by 4 or not");
		if (d%4 == 0)
		{
			System.out.println("given no"+d+" is divisible by 4");
		}
		else
		{
			System.out.println("Not divisible"+d);
		}
	}
	public static void table()
	{

	int a=130;
	System.out.println("Printing 13th table using while loop:");
	while(a>=0)
	{
		System.out.println( +a);
		a=a-13;			
	}
	}
}
