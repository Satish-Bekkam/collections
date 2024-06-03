// find sum of elements in list

package List;
import java.util.Scanner;
import java.util.*;

public class Listassagnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit:");
		int n=sc.nextInt();
		ArrayList<Integer> li = new ArrayList<>();
		
		
		for(int i=0; i<=n; i++) {
		System.out.println("Enter the number"+i);
		li.add(sc.nextInt());
		}
		System.out.println(li);
		int sum=0;
		for(int  number :li) {
			sum += number;
		}
		int avg=sum/(li.size());
		System.out.println("sum of elements is" +sum);
		System.out.println("avg of elements is" +avg);


	

	}

}