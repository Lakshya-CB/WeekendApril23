package Lec_06;

public class array_demo_2 {
	public static void main(String[] args) {

		int[] arr1 = new int[5];
		int[] arr2 = arr1;

		arr2[0] = 10;

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		arr2 = new int[5];
		arr2[0] = 99;

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

	}
}
