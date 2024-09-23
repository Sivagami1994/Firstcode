package Overriding;

public class childh1 extends parenth1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		childh1 w = new childh1();
		w.a1();
		parenth1 x = new parenth1();
		x.a1();
	}
	public void a1()
	{
		int l=9;
		int b=8;
		System.out.println(" This is child class,Area of rectangle" +l*b);
	}
	

}
