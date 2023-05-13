package Lec_08;

import java.util.Arrays;

public class Sooooorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(arr));
//		bubble(arr);
//		Selection(arr);
		Insertion(arr);

	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 1 - cnt; s++) {
//			 s and s+1
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void Selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_idx = 0;
			for (int idx = 0; idx <= last; idx++) {
				if (arr[idx] > arr[max_idx]) {
					max_idx = idx;
				}
			}
			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;

			System.out.println(Arrays.toString(arr));
		}
	}

	public static void Insertion(int[] arr) {
		for (int toIns = 1; toIns <= arr.length - 1; toIns++) {
			int idx = toIns - 1;
			int ali = arr[toIns];
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));
		}
	}
}
