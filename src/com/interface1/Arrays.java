package com.interface1;

public class Arrays {



	public static void main(String[] args) {
		int j;
		 int sum = 0;
   int[] i = new int[5];
      i[1] = 5;
      i[2] = 6;
      i[3] = 8;
      i[4] = 9;
      
      for(j=0; j<=4; j++) {
    	  
    	  System.out.println(i[j]);
    	 
    	  sum += i[j];
    	 
 
    	  
      }
      System.out.println(sum);
     }

}


