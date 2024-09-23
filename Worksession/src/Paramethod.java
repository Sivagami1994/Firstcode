
public class Paramethod {

	public static void main(String[] args) {
		
Paramethod.details("Sivagami", 27);
Paramethod.details("Shiv", 28);
Paramethod.details("Aru", 2);
Paramethod.finds(2,9);
System.out.println("Division is:  "+Paramethod.div(2.3f, 3.1f));
System.out.println("Subtraction is "+Paramethod.sub(8.3, 4.2));
System.out.println("Organisation "+Paramethod.org("CTS"));
System.out.println("Private(Y/N) : "+Paramethod.letter('y'));
System.out.println("Status Active (True/False)) "+Paramethod.result(true));
	}
	public static void details(String name, int age)
	{
		System.out.println("Name is"+name);
		System.out.println("Age is "+age);
		
	}
	public static void finds(int n1, int n2)
	{
		int result = n1*n2;
		System.out.println("Product of two number :"+result);
	}
	public static float div(float d1, float d2)
	{
		return d1/d2;
	}
	public static double sub(double s1, double s2)
	{
		return s1-s2;
	}
	public static String org(String o1)
	{
		return o1;
	}
	public static char letter(char l)
	{
		return l;
	}
	public static boolean result(boolean r)
	{
		return r;
	}
	
	}

