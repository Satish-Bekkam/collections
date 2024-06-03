package List;
import java.util.*;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit:");
		int n=sc.nextInt();
		ArrayList<Integer> li = new ArrayList<>();
		ArrayList<Integer> el = new ArrayList<>();
	ArrayList<Integer> ol = new ArrayList<>();
		
	for(int i=0; i<=n;i++) {
	System.out.println("enter a number"+i );
			li.add(sc.nextInt());
		}
		System.out.println("elements in list is"+li);
		int sum=0;
		for(int j:li) 
	{
		if(j%2==0) {
		el.add(j);
		sum +=j;
			
				
		}else {
		  ol.add(j);
		}
		}
		System.out.println("even number in list" +el);
		System.out.println("Sum of even number in list" +sum);
		System.out.println("odd number in list" +ol);
	
		}
	
	}


