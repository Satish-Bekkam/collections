import java.io.*;
import java.util.*;

public class Compare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Set<String> mySet = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++){
            String pair = sc.nextLine();
            
            mySet.add(pair);
            System.out.println(mySet.size());
        }
    }
}