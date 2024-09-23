package mock;

public class c2 extends c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c1 obj =new c1();
		obj.small(2,3);
		c2 obj1 =new c2();
		obj1.small(23,45,99,87);
		
	}
	public void small(int n1, int n2, int n3, int n4) {
		if(n1<n2 && n1<n2 && n1<n3)
		{
			System.out.println("N1 is smallest:"+ n1);
		}else if(n2<n1 && n2<n3 && n2<n4)
		{
			System.out.println("N2 is smallest:" +n2);
		}else if(n3<n1 && n3<n2 && n3<n4)
		{
			System.out.println("N3 is smallest:" +n3);
		}else if(n4<n1 && n4<n2 && n4<n3)
		{
			System.out.println("N2 is smallest:" +n4);
		}
		
	}

}
