package Overriding;

public class child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parent p = new parent();
		child c1= new child();
		p.p1();
		c1.p1();
	}
	public void p1()
	{
		System.out.println("In child class overriding method");
		int s=9;
		System.out.println("Area of sq:" +s*s);
	}

}
