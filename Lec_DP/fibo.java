package Lec_DP;

public class fibo {
	public static void main(String[] args) {
		int N = 5000;
//		int ans = fibo(N);
		int ans = fiboTD(N, new Integer[N + 1]);
		System.out.println(ans);
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);
		return sp1 + sp2;
	}

	public static int fiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) { // memo => use your current solution
			return dp[n];
		}
		int sp1 = fiboTD(n - 1, dp);
		int sp2 = fiboTD(n - 2, dp);
		dp[n] = sp1 + sp2; // store
		return sp1 + sp2;
	}

	public static int BU(int N) {
//		Step 1 : dp array without size!!
		int[] dp = new int[N + 1];
		
//		Step 2 : loops => smallest to biggest problem
		for (int n = 0; n <= N; n++) {
//			Step 5 : base case!!!
			if (n <= 1) {
				dp[n] = n;
				continue;
			}
//			Step 3: create current solution !!
//			dp[n]! !! => fibo(n)
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2; // store
		}
//		Step 4: biggest problem return!!
		return dp[N];

	}

}
