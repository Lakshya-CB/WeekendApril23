package Lec_12;

import java.util.ArrayList;

public class AL_QPs {

	public static void main(String[] args) {
//		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
//		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
////		ArrayList<Integer> AL = Intersection(arr1, arr2);
//		System.out.println(Intersection(arr1, arr2));
		int[] one = { 9, 8, 7, 5 };
		int[] two = { 9, 6, 7 };
		System.out.println(add(one, two));
	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		int idx1 = 0;
		int idx2 = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else if (arr2[idx2] < arr1[idx1]) {
				idx2++;
			} else {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> add(int[] arr1, int[] arr2) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			idx1--;
			idx2--;
			int digit = sum % 10;
			carry = sum / 10;
			AL.add(0,digit);
		}
		if (carry > 0) {
			AL.add(0,carry);
		}
		return AL;
	}
}
