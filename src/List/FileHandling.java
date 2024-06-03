package List;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException
{
		File f = new File("/Users/BE20423033/Desktop/resume.txt");
		System.out.println(f.createNewFile());
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/BE20423033/Desktop/resume.txt"));
		bw.write("hii i am satish");
		bw.write(" hello");
		bw.write("HIII mohan");
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("/Users/BE20423033/Desktop/resume.txt"));
		String st;
//        while((st = br.readLine()) !=0)
		System.out.println(br.readLine());
		br.close();
	}
	
	  
}


	


