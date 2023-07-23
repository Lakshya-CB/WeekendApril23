package Lec_23;

import java.util.LinkedList;
import java.util.Queue;

public class Q_QPS {
	public static void main(String[] args) {
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		firstNegWinK(arr, 3);
	}

	public static void firstNegWinK(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		if (!Q.isEmpty()) {
			System.out.println(arr[Q.peek()]);
		} else {
			System.out.println(0);
		}
		for (int s = 1; s <= arr.length - k; s++) {
			if (!Q.isEmpty() && Q.peek() == s - 1) {
				Q.poll();
			}
			int e = s + k - 1;
			if (arr[e] < 0) {
				Q.add(e);
			}
			if (!Q.isEmpty()) {
				System.out.println(arr[Q.peek()]);
			} else {
				System.out.println(0);
			}
		}

	}
}
