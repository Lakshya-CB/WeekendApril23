package Lec_PQ_HM;

import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		topKLargest(arr, 3);
		int[][] mat = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
		MergeKSorted(mat);
	}

	public static void topKLargest(int[] arr, int K) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > K) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

	static class pair implements Comparable<pair> {

		public pair(int ali, int arr_, int ali_) {
			data = ali;
			arr_idx = arr_;
			ali_idx = ali_;
		}

		int data;
		int arr_idx;
		int ali_idx;

		@Override
		public int compareTo(pair o) {
			return this.data - o.data;
		}

		@Override
		public String toString() {
			return "" + data;
		}
	}

	public static void MergeKSorted(int[][] mat) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();

		for (int idx = 0; idx < mat.length; idx++) {
			PQ.add(new pair(mat[idx][0], idx, 0));
		}
		System.out.println(PQ);
		while (!PQ.isEmpty()) {
			pair nn = PQ.poll();
			System.out.println(nn.data);
			nn.ali_idx++;
			if (nn.ali_idx < mat[nn.arr_idx].length) {
				nn.data = mat[nn.arr_idx][nn.ali_idx];
				PQ.add(nn);
			}
			System.out.println(PQ);
		}

	}
}
