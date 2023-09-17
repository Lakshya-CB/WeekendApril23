package Lec_DP;

public class climb_stairs {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(climbStairsTD(0, n, new Integer[n + 1]));

	}

	public static int climbStairsTD(int curr, int n, Integer[] dp) {
		if (curr > n) {
			return 0;
		}
		if (curr == n) {
			return 1;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = climbStairsTD(curr + 1, n, dp);
		int sp2 = climbStairsTD(curr + 2, n, dp);
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int N) {
//		Step 1 : dp array
		int[] dp = new int[N + 2];
//		Step 2 : variables ke loops!!
		for (int curr = N; curr >= 0; curr--) {

			if (curr == N) {
				dp[curr] = 1;
				continue;
			}

//			Step 3 : dp[curr]!! =>
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
//			int sp2 = 0;
//			if (curr + 2 <= N) {
//				sp2 = dp[curr + 2];
//			}
			dp[curr] = sp1 + sp2;
		}
//		Step 5: Biggest problem!!
		return dp[0];

	}

}
