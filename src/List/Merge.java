package List;
import java.util.*;

public class Merge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the list");
		int n =  sc.nextInt();
		ArrayList<Integer> li=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>();
		for(int i=0; i<=n; i++) {
			System.out.println("ENTER NUMBERS" +i);
			li.add(sc.nextInt());
		}
		for(int i=0; i<=n; i++) {
			System.out.println("ENTER NUMBERS in list 2" +i);
			l1.add(sc.nextInt());
		}
		li.addAll(l1);
		System.out.println(li);
		

	}

}
