package com.inheritance;

public class User{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Guest g = new Guest();
       g.read();
       Developer d = new Developer();
       d.write();
       d.read();
       Admin a = new Admin();
       a.edit();
       a.read();
       a.write();
	}

}
