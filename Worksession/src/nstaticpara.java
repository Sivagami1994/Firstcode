
public class nstaticpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nstaticpara p1 = new nstaticpara();
System.out.println("Sub is"+ p1.sub(12.5,9.8));
System.out.println("add 3 no's is "+ p1.add3(12.5f,9.8f,7.5f));
System.out.println("Messgae is"+ p1.msg("hi"));
System.out.println("letter is"+p1.letter('l'));
System.out.println("Status is "+ p1.status(true));

	}

	public double sub(double s1, double s2)
	{
		return s1-s2;
	}
	public float add3(float a1, float a2, float a3)
	{
		return a1+a2+a3;
	}
	public String msg(String m1)
	{
		return "hi";
		
	}
	public char letter(char l)
	{
		return 'l';
	}
	public boolean status(boolean s)
	{
		return s;
	}
}
