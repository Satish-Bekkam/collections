package com.java.files;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String s = "satish";
	StringBuilder input1 = new StringBuilder();
	input1.append(s);
	
	System.out.println(input1.reverse());
	
	char[] ch=s.toCharArray();
	for(int i=ch.length-1; i>=0; i--) {
		System.out.print(ch[i]);
		
	}
}
}