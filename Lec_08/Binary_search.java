package Lec_08;

public class Binary_search {
	public static void main(String[] args) {
		int[] arr = 
			{ 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
	}

	public static boolean BS(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]==ali) {
				return true;
			}else if(arr[mid]>ali) {
				e = mid-1;
			}else {
				s = mid+1;
			}
			
		}
		return false;		
	}
}
