package List;
import java.util.Scanner;
import java.util.*;

public class Splitlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the list");
		int n =  sc.nextInt();
		ArrayList<Integer> li=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		for(int i=0; i<=n; i++) {
			System.out.println("ENTER NUMBERS" +i);
			li.add(sc.nextInt());
		}
		System.out.println(li);
		System.out.println("Enter the position you want to saparate:");
		int s=sc.nextInt();

		for(int k :li) {
		if(k<=s) {
		l1.add(k);
	}else {
		l2.add(k);
	}
	}
		
		System.out.println(l1);
		System.out.println(l2);
		

	}

}
