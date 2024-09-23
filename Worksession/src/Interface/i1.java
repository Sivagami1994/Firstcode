package Interface;

public interface i1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*interface: blueprint of class
		 *doesnot contain main method
		 *doesnot contain static method
		 *will have nonstatic method with default keywor
		 *will hve abstract method without abstract keyword
		 *     will be empty
		 *     will be redefined in the class to which interface connects
		 *     
		 *      class<=> class:  extends
		 *      class<=> interface:  implements 
		 *      
		 *      class definition: implements interfacename
		 * */
	default public void rectangle()
	{
		int l=9;
		int b=8;
		System.out.println("Area of rectangle:"+l*b);
	}
	public void ab();

}
