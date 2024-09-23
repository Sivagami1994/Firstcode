
public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child.cs();
		child c = new child();
		c.ns();
		c.ps();
	}	
		public static void cs()
		{
			System.out.println("Child class with stattic");
		}
		public void ns()
		{
			System.out.println("Child class with nstatic");
		}

	}
