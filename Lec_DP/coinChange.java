package Lec_DP;

public class coinChange {
	public static void main(String[] args) {
		int[] coins = { 2, 5, 3, 6 };
		int A = 10;
//		System.out.println(solveTD(A, 0, new Integer[A + 1][coins.length + 1], coins));
		System.out.println(BU(A, coins));
	}

	public static int solveTD(int amount, int idx, Integer[][] dp, int[] coins) {
		if (amount == 0) {
			return 1;
		}
		if (amount < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[amount][idx] != null) {
			return dp[amount][idx];
		}
		int sp1 = solveTD(amount - coins[idx], idx, dp, coins);
		int sp2 = solveTD(amount, idx + 1, dp, coins);
		dp[amount][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int A, int[] coins) {
		int[][] dp = new int[A + 1][coins.length ];
		for (int amount = 0; amount <= A; amount++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
				if (amount == 0) {
					dp[amount][idx] = 1;
					continue;
				}
//				dp[amount][idx] = >! solve(amount,idx)!!
				int sp1 = 0;
				if (amount - coins[idx] >= 0) {
					sp1 = dp[amount - coins[idx]][idx];
				}
				int sp2 = 0;
				if (idx + 1 < coins.length) {
					sp2 = dp[amount][idx + 1];
				}
				dp[amount][idx] = sp1 + sp2;
			}
		}
		return dp[A][0];
	}
}
