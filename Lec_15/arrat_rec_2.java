package Lec_15;

public class arrat_rec_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		Rev(0, arr);
	}

	public static void Rev(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
		Rev(s + 1, arr);
		System.out.println(arr[s]);
	}

	public static int Max(int s, int[] arr) {
//		BP : Max(0)
//		SP : Max(1)
//		if(s==arr.length-1) {
//			return arr[s];
//		}
		if (s == arr.length) {
			return Integer.MIN_VALUE;
		}
		int sp = Max(s + 1, arr);
		return Math.max(arr[s], sp);
	}

	public static int FO(int s, int ali, int[] arr) {
		if (s == arr.length) {
			return -1;
		}
		int sp = FO(s + 1, ali, arr);
		if (arr[s] == ali) {
			return s;
		}
		return sp;
	}

	public static int LO(int s, int ali, int[] arr) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LO(s + 1, ali, arr);
		if (sp == -1 && arr[s] == ali) {
			return s;
		}
		return sp;
	}
}
