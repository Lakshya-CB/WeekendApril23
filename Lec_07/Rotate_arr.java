package Lec_07;

public class Rotate_arr {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		print(arr);
		rotate(arr, -17);
//		print(arr);
//		System.out.println(-17%5);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void Rev(int[] arr, int L, int R) {
		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		Rev(arr, 0, arr.length - 1);
		print(arr);
		Rev(arr, 0, rot - 1);
		print(arr);
		Rev(arr, rot, arr.length - 1);
		print(arr);
	}
}
