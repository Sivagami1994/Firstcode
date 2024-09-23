package protectedpp;

public class child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
		c.m1();
		c.mm();
		child.s1();
	}
	public void mm()
	{
		System.out.println("child class");
	}

}
