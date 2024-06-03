package com.java.files;

public class r {

	public static void main(String[] args) {
		
		String s= "satish";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse());
		// TODO Auto-generated method stub
		char[] ch =s.toCharArray();
		for(int i= ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		

	}

}
