package exceptionhandling;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//System.out.println(9/0);
			String n="hi";
			System.out.println(n.charAt(5));
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception "+e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index out of err"+e);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	

}
