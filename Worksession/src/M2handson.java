
public class M2handson {

	public static void main(String[] args) {
		M2handson.address("Coimbatore city",12345);
		System.out.println("Area of traiangle:" +M2handson.triangle(12,12));
		System.out.println("Area of Square:" +M2handson.square());
		System.out.println("Average of 2 no's:" +M2handson.average(23,12));
		System.out.println("Area of Hemisphere:" +M2handson.hemisphere());
		M2handson.trapezium(12f,23f,23f);
		M2handson.quad();
		

	}
	public static void address(String a1, int id)
	{
		System.out.println("Address is "+a1);
		System.out.println("ID is:" +id);
		
	}
	public static float triangle(float n1, float n2)
	{
		return (0.5f*n1*n2);
		  
	}
	public static int square()
	{
		int a=4;
		return 4*a;
		
	}
	public static int average(int a1, int a2)
	{
		return a1+a2/2;
	}
	public static double hemisphere()
	{
		double r=2;
		return (3*3.14*r);
		
	}
	public static void trapezium(float a, float b, float h)
	{
		System.out.println("Area of trapezium:"+ 0.5*(a+b)*h);
		
	}
	public static void quad()
	{
		double b = 12;
		double h =23.3;
		System.out.println("Area of quadraline" +b*h);
		
	}
	

}
