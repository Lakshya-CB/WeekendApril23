package Lec_PQ_HM;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_Demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ 
		= new PriorityQueue<Integer>(Collections.reverseOrder());
		
		PQ.add(10);
		PQ.add(2);
		PQ.add(100);
		PQ.add(15);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
	}
}
