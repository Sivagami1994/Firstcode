package Inheritance;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child.cs();
child c = new child();
child.ps();
c.pn();
c.cn();

		
	}

	public static void cs()
	{
		System.out.println("Child with static");
		
	}
	public void cn()
	{
		System.out.println("Child with nstatic");
	}
}
