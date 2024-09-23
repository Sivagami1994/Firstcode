
public class MethodHandson {
	public static int psquare()
	{
		int ps= 5;
		return 4*ps;
	}
	public static double cylinder()
	{
		double r=9.9;
		double l=8.8;
		return 3.14*r*l;
	}
	public static void basic()
	{
		String name ="Sivagami";
		int Age =27;
		System.out.println("Name: "+name);
		System.out.println("Age: "+Age);
		
	}
	public static void info()
	{
		String height ="5.65";
		double weight = 55.3;
		System.out.println("Height is:" +height);
		System.out.println("Weight is:" +weight);
	}
	public static float average()
	{
		float a1=12.3f;
		float a2=2.3f;
		float a3=4.56f;
		float a4=8.9f;
		return ((a1+a2+a3+a4)/4);
	}
	public static int Product()
	{
		int f=12;
		int o=23;
		int u=14;
		int r=23;
		return f*o*u*r;
	}
	public static String Name()
	{
		String Name ="Siva";
		return Name;
		
	}
	public static double Height()
	{
		double hei=5.56;
		return hei;
	}
	public static double bmid()
	{
		double kg=55.7;
		double m=23.2;
		double i=(kg/m*m);
		return i;
	}
	public static void message()
	{
		String m="Welcome";
		System.out.println(m);
	}

	public static void main(String[] args) {
System.out.println("Perimeter of Square is:" +MethodHandson.psquare());	
System.out.println("Area of cylinder is:" +MethodHandson.cylinder());
MethodHandson.basic();
MethodHandson.info();
System.out.println("Name is:"+MethodHandson.Name());
System.out.println("Height is:" +MethodHandson.Height());
System.out.println("BMI is:" +MethodHandson.bmid());
MethodHandson.message();

	}
	}
