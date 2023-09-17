package Lec_DP;

public class house_robber {
	public static void main(String[] args) {

	}

	public static int lootle(int idx, int[] house) {
		if (idx >= house.length) {
			return 0;
		}
		int sp1 = house[idx] + lootle(idx + 2, house);
		int sp2 = lootle(idx + 1, house);
		return Math.max(sp1, sp2);
	}

	public static int lootle_TD(int idx, Integer[] dp, int[] house) {
		if (idx >= house.length) {
			return 0;
		}
		if (dp[idx] != null) {
			return dp[idx];
		}
		int sp1 = house[idx] + lootle_TD(idx + 2, dp, house);
		int sp2 = lootle_TD(idx + 1, dp, house);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] house) {
		int[] dp = new int[house.length + 2];

		for (int idx = house.length - 1; idx >= 0; idx--) {
//			dp[idx]!! = >lootlee(idx)!!
			int sp1 = house[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[0];
	}

}
