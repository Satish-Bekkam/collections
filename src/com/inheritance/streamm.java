package com.inheritance;
import java.util.Arrays;
import java.util.stream.*;

import java.util.*;

public class streamm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(20,10,30,40);
			Stream<Integer> s = Stream.of(20,40,3,4,50);
			s.filter(i->i<20)
			.forEach(System.out::println);
			li.stream()
			.filter(i->i%5==0)
			.forEach(System.out::println);
			
			

	}

}
