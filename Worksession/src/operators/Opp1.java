package operators;

public class Opp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int record =20;
		System.out.println(record);
		System.out.println(record+=20);
		//record is max 20
		System.out.println(record+-20);
		System.out.println(record*=2);
		System.out.println(record/=2);
		System.out.println(record>20 ? "Yes": "No");
		
		/*true     true     true
		 * true    false    false
		 * false   true     false
		 * false   false    false
		 * 
		 * or
		 * 
		 * true    true   true
		 * true    false  true
		 * false   treu   true
		 * false   false  false 
		 * 
		 * not
		 * 
		 * true   false
		 * false   true
		 * 
		 * 
		 * * 
		 * */
		
		int a=40;
		int b=3;
		System.out.println(a>3 && b<4);
		System.out.println(a>3 && b==4);
		System.out.println(a==3 && b<4);
		System.out.println(a==3 && b==4);
		System.out.println();
		
		System.out.println(a>3 || b<4);
		System.out.println(a>3 || b==4);
		System.out.println(a==3 || b<4);
		System.out.println(a==3 || b==4);
		
		System.out.println();
		System.out.println(a==40);
		System.out.println(a!=40);
		
		

	}

}
