package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file1 {

	public static void main(String[] args) throws IOException {
		//creating a file and writing into it
		
				//File                    :    reach the file           : pass name of the file
				//FileWriter              :   create a file             : pass file object as input
				//BufferedWriter          :   write into it             : pass filewriter object as input 
				
				// nonstatic in nature
		
		File f= new File("Siva.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi");
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("bye");
		bw.newLine();
		bw.close();

	}

}
