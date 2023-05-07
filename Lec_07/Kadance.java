package Lec_07;

public class Kadance {
	public static void main(String[] args) {
		int[] arr = { 2, 5, -8, 40, 2, -41, 70, 5, -6, -50, 1, 2, -9999 };
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int ans = 0;
		int sum = 0;

		for (int ali : arr) {
			sum = sum + ali;
			ans = Math.max(ans, sum);
			sum = Math.max(sum, 0);
//			System.out.println(sum);
//			if (ans < sum) {
//				ans = sum;
//			}
//			if (sum < 0) {
//				sum = 0;
//			}
		}
		return ans;
	}
}
