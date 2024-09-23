package Superkeyword;

public class child extends parent{
	int age =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

child c = new child();
c.age();
	}
	
	public void age()
	{
		System.out.println(super.age);
		System.out.println(age);
	}

}
