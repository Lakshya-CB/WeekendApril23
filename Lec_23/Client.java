package Lec_23;

import Lec_22.Queue;

public class Client {
	public static void main(String[] args) {
		Dynamic_Queue Q = new Dynamic_Queue();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		Q.add(60);
		Q.add(70);
		Q.add(80);
		
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		
	}
}
