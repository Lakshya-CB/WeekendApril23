package Lec_22;

import java.util.LinkedList;
import java.util.Queue;

public class Q_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
//		System.out.println(Q);
//		print(Q);
//		printRev(Q);
//		System.out.println(Q);
//		printRev(Q);
		printRev(Q, 4);
	}

	public static void print(Queue<Integer> Q) {
		for (int cnt = 1; cnt <= Q.size(); cnt++) {
			System.out.print(Q.peek() + " ");
			Q.add(Q.poll());
		}
		System.out.println();
	}

	public static void Reverse(Queue<Integer> Q) {
		if(Q.isEmpty()) {
			return;
		}
		int ali = Q.poll();
		Reverse(Q);
		Q.add(ali);
		System.out.println(ali);
	}
	public static void printRev(Queue<Integer> Q,int size) {
		if(size==0) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		printRev(Q,size-1);
		System.out.println(ali);
	}
}
