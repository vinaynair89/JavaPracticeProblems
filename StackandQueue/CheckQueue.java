package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CheckQueue {

	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<Integer>();
		
		q.add(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		System.out.println(q.poll());
		
		System.out.println(q.peek());
		
		q.remove();
		
		System.out.println(q);
		
		
		
		System.out.println(q.element());
		
		
		
	}

}
