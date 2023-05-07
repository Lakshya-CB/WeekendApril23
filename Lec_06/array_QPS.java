package Lec_06;

public class array_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 3, 10, 99, -2 };
		revPrint(arr);
	}

	public static void revPrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int max(int[] dheela) {
		int jeb = dheela[1];
		for(int aam : dheela) {
			if(aam >jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}
}
