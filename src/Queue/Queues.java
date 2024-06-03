package Queue;

import java.util.*;

public class Queues {
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		Deque<Integer> dq = new ArrayDeque<>();
		 dq.add(4);
		 dq.addFirst(3);
		 dq.offerFirst(3);
		 dq.offerLast(3);
		 System.out.println(dq);
	}
	   

}
