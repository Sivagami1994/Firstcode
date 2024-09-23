
public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String :  datatype/class
				// nonstatic in nature
				//n- object/variable 
				
				String n="Welcome";
				//   index   0    1    2    3     4     5     6    
				//           W    e   l     c     o    m      e
				
				System.out.println(n.length());
				System.out.println(n.indexOf('c'));
				System.out.println(n.charAt(1));
				
				System.out.println(n.toUpperCase());
				System.out.println(n.toLowerCase());
				
				System.out.println(n+"hi");
				System.out.println(n.concat("hi"));
				
				System.out.println(n.replace('W', 'g'));
				System.out.println(n.replace("come", "go"));
				
				System.out.println(n.contains("dsn"));
				
				System.out.println(n.substring(3, 6));// end index is exclusive in nature    3,4,5
				

	}

}
