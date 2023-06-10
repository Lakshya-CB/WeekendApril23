package Lec_14;

public class Array_rec_01 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		print_arr(arr.length-1, arr);
//		print_arr2(0, arr);
		print_arr3(0, arr.length-1, arr);
		
	
	}
	public static void print_arr(int e, int[]arr) {
//		
		if(e<0) {
			return;
		}
		print_arr(e-1, arr); //10,20,30,
		System.out.println(arr[e]);
	}
	public static void print_arr2(int s, int[] arr) {
//		BP : (0,arr)
//		Sp : (1,arr)
		if(s==arr.length) {
			return;
		}
		System.out.println(arr[s]);
		print_arr2(s+1, arr);
	}
	
	public static void print_arr3(int s, int e, int[] arr) {
		if(s>e) {
			return;
		}
		int mid = (s+e)/2;
		print_arr3(s,mid-1, arr);
		System.out.println(arr[mid]);
		print_arr3(mid+1, e, arr);
	}
}
