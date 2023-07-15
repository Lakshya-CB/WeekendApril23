package Lec_21;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS_2 {
	public static void main(String[] args) {
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGreater2(arr);
	}

	public static void nextGreater(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
	}

	public static void nextGreater2(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				System.out.println(arr[A_idx] + "=>" + B);
				ans[A_idx] = B;
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));
	}
}
