package List;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=0;
		try {
		
		 c=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally{
		System.out.println(c);
		}
		System.out.println(c);
	}

}
