package Overaloding;

public class handson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
handson1.m1();
handson1.m1(2);
handson1.m1(2,3.5);

	}
	public static void m1()
	{
		System.out.println("This is overloading method, no params");
	}
	public static void m1(int w)
	{
		System.out.println("Overloading method1:"+w*w);
	}
	public static void m1(int w, double x)
	{
		System.out.println("Overloading method2 with 2 diff params:" + w*x);
	}

}
