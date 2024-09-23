package Constructor;

import java.util.Scanner;

public class c1 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 c= new c1();
	}
	public c1()
	{
		System.out.println("Enter the area: ");
		int a = input.nextInt();
		System.out.println("Area of SQ:" + a*a);
	}

}
