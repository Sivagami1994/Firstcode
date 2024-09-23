
public class ns1 {

	public static void main(String[] args) {
		ns1 nn = new ns1();
		System.out.println("add "+nn.add());
		System.out.println("div "+nn.div());
		System.out.println("name "+nn.name());
		System.out.println("initial "+nn.ini());
		System.out.println("result "+nn.result());

	}
	public int add()
	{
		int a=2;
		int b=3;
		return a*b;
	}
	public double div()
	
	{
		double d=9;
		double e=2;
		return d/e;
	}
	public String name()
	{
		return "Siva";
			
	}
	public char ini()
	{
		return 'S';
	}
public boolean result()
{
	return true;
}
}
