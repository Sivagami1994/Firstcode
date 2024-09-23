package exceptionhandling;

public class c1 {
	/*exception handling: mechanism that will help u to handle the exceptions
	 * checked
	 * unchecked 
	 * 
	 * try catch
	 * try catch finally
	 * try with multiple catch
	 * throws
	 * throw
	 ** 
	 * */

	public static void main(String[] args) {
		//try: code whcih is having prob of getting error
				//catch: executed when error occurs
				//finally: always execute
		
		try
		{
			System.out.println(3/0);
			System.out.println(3/1);
		}
		catch(Exception e)
		{
			System.out.println("error is :"+e);
		}
		finally
		{
			System.out.println("bye");
		}

	}
	
	

}
