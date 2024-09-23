package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class handson {

	public static void main(String[] args) throws IOException {
			
			File f= new File("handson.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Siva");
			bw.newLine();
			bw.write("27");
			bw.newLine();
			bw.write("Cheran manager, CBE");
			bw.newLine();
			bw.close();
	}

}
