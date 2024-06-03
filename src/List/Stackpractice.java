package List;

import java.util.*;

public class Stackpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<String>();
		st.add("green");
		st.add("red");
		st.add("yellow");
		st.add(0,"blue");
		System.out.println(st);
		System.out.println(st.search("yellow"));
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);

	}

}
