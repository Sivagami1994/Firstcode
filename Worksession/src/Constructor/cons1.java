package Constructor;

public class cons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons1 c12 =new cons1();
new cons1("param const");
	}
	public cons1()
	{
		System.out.println("default constructor");
	}
	public cons1(String msg)
	{
		System.out.println(""+msg);
	}

}
