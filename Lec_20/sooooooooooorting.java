package Lec_20;

import java.util.Arrays;

public class sooooooooooorting {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 20, 30, 40, 50 };
//		int[] arr2 = { 5, 20, 25, 100 };
//		System.out.println(Arrays.toString(marja_ray(arr1, arr2)));
		int[] arr = { 30, 2, 5, 19, 3, 11, 18 };
		System.out.println(Arrays.toString(arr));
		quick(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));	
	}

	public static void quick(int[] arr, int s, int e) {
		if(s==e) {
			return;
		} 
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L <= R) {
			while (pivot > arr[L]) {
				L++;
			}
			while (pivot < arr[R]) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		quick(arr, s, R);
		quick(arr, R, e);

	}

	public static int[] marja_ray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx3] = arr1[idx1];
				idx1++;
				idx3++;
			} else {
				ans[idx3] = arr2[idx2];
				idx2++;
				idx3++;
			}
		}
		while (idx1 < arr1.length) {
			ans[idx3] = arr1[idx1];
			idx1++;
			idx3++;
		}
		while (idx2 < arr2.length) {
			ans[idx3] = arr2[idx2];
			idx2++;
			idx3++;
		}
		return ans;
	}

	public static int[] mergeSort(int[] arr, int s, int e) {
		if (s == e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = mergeSort(arr, s, mid);
		int[] sp2 = mergeSort(arr, mid + 1, e);
		return marja_ray(sp1, sp2);
	}
}
