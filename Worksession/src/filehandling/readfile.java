package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//creating a file and writing into it
				
				//File                    :    reach the file           : pass name of the file
				//FileReader             :   create a file             : pass file object as input
				//BufferedReader          :   write into it             : pass filewriter object as input 
				
				// nonstatic in nature
		

File f= new File("Siva.txt");
FileReader fw = new FileReader(f);
BufferedReader bw = new BufferedReader(fw);

String line;

while ((line=bw.readLine())!=null)
{
	System.out.println(line);
}
	}
	
	/*
	 *first    bw.readline reads first line     line=hi          line!=null        print line    print hi
	 *second   bw.readline reads second line    line=hello      line!=null        print line     print hello
	 *third    bw.readling reads third line     line=bye        line!=null        print line    print  bye
	 *fourth   bw.readling reads nothing        line=nulll      line!=null     null!=null  loop terminates  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
