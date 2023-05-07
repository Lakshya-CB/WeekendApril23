package Lec_07;

public class subarray_ {
	public static void main(String[] args) {
		int[] arr = { -10, 20, -5, 12 };
		M2(arr);
	}

	public static void M2(int[] arr) {
//		int sum =0;		 //A
		int ans = 0;
		for (int s = 0; s < arr.length; s++) {
			int sum =0; //B
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
//				int sum = 0;// C
				sum = sum + arr[e];
//				System.out.println("=>" + sum);
				
				if(ans <sum) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}

	public static void M1(int[] arr) {
//		int sum =0;		
		for (int s = 0; s < arr.length; s++) {
//			int sum =0;
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				int sum = 0;

				for (int i = s; i <= e; i++) {
					System.out.print(arr[i] + " ");
					sum = sum + arr[i];
				}
				System.out.println("=>" + sum);
			}
		}
	}

}
