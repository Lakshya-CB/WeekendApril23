package Lec_06;

public class Array_1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = 2 * idx + 2;
		}

		
		for (int ali : arr) {
			System.out.println(ali);
		}
	}
}
