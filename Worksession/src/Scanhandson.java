import java.util.Scanner;

public class Scanhandson {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter name");
		String n= ob.nextLine();
		System.out.println("Enter Age");
		int a= ob.nextInt();
		System.out.println("Enter Salary");
		float s= ob.nextFloat();
		System.out.println("Enter height");
		Double h= ob.nextDouble();
		System.out.println("name is "+n);
		System.out.println("Age is "+a);
		System.out.println("Salary is "+s);
		System.out.println("Height is "+h);
		
		
		

	}

}
