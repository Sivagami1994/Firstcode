
public class str2buf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer n=new StringBuffer("Welcome");
		//   index   0    1    2    3     4     5     6    
		//           W    e   l     c     o    m      e
		
		System.out.println(n.length());
		System.out.println(n.indexOf("e"));
		System.out.println(n.lastIndexOf("e"));
		System.out.println(n.charAt(5));
		
		// inserting, appending
		System.out.println(n.append("hi"));
		System.out.println(n.insert(1, "S"));
		
		//deleting
		System.out.println(n.deleteCharAt(1));
		System.out.println(n.delete(7, 9));
		
		//replace
		System.out.println(n.replace(0, 3, "AAAA"));
		
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		
		System.out.println(n.substring(0, 3));
		System.out.println(n.isEmpty());
		System.out.println(n.));
		System.out.println(n);

	}

}
