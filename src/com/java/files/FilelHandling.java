package com.java.files;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FilelHandling {

	public static void main(String[] args) throws IOException {
		ArrayList<String> li=new ArrayList<>();
		File f = new File("/Users/BE20423033/Desktop/Resume.txt");
		FileInputStream fis=new FileInputStream(f);
	      int asci;
		while((asci = fis.read())!= -1) {
	System.out.print((char)asci);
	String convertedString = convertASCIIToString(asci);
	 String s1=(String)asci;
	li.add(Arrays.toString(s1.split("\\+")));
		
		}
		
		fis.close();
		

	        }
       
		

}

