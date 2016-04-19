package StackandQueue;

import java.util.PriorityQueue;

public class PriQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("a");
		pq.add("b");
		pq.add("e");
		pq.add("g");
		pq.add("q");
		pq.add("c");
		pq.add("f");
		pq.add("n");
		pq.add("e");
		pq.add("l");
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		
	}

}
