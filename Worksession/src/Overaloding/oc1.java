package Overaloding;

public class oc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * overloading: using same methodname for different purpose showing
		 *              difference in number of parameters/datatype or sequence
		 *              
		 *              static, nonstatic, constructor
	* 
		 * */

		oc1 o1= new oc1();
		o1.area();
		o1.area(5);
		o1.area(5,6.5);
		
		
	}
	public void area()
	{
		System.out.println("Im Constructor");
	}
	public void area(int s)
	{
		System.out.println("Area of Sq:" + s*s);
	}
	public void area(int s1, double s2)
	{
		System.out.println("Addition of 2 no's: "+ s1+s2);
	}

}
