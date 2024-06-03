package List;

import java.util.*;

public class Linkedlistpractice {

	public static void main(String[] args) {
		String s ="Satish";
		char[] ch = s.toCharArray();
		for (int i= ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb)
		
	}

}
