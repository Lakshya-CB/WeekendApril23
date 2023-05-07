package Lec_07;

public class Array_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
//		Rev(arr);
		rotate(arr, 2);
//		print(arr);
//		System.out.println(find(arr, 20));
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;

		for (int cnt = 1; cnt <= rot; cnt++) {
			int temp = arr[arr.length - 1];
			for (int L = arr.length - 1; L >= 1; L--) {
				arr[L] = arr[L - 1];
			}

			arr[0] = temp;
			print(arr);
		}
	}

	public static int find(int[] arr, int ali) {
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == ali) {
				return idx;
			}
		}
		return -1;
	}

	public static void Rev(int[] arr) {
		int R = arr.length - 1;
		int L = 0;
		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}
}
