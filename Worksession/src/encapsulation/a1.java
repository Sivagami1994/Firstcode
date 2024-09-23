package encapsulation;

public class a1 {

	public static void main(String[] args) {
		/*encapsulation: hiding data
		 * 
		 * declare the variable private 
		 * must not assign value straighlty to the variable
		 * acess the variable through setter and getter
		 * setter:  assign value to the variable
		 * getter: view the value of the variab;le 
		 * 
		 * setter, getter:non static and public 
		 * * */

	}
	private String password;
	//setter
	public void set(String a)
	{
		password=a;
	}
	
	public void get()
	{
		System.out.println(password);
	}

}
