package Lec_13;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		solve(25);
	}

	public static void solve(int n) {
		boolean[] isComp = new boolean[n + 1];
		for (int div = 2; div * div <= n; div++) {
			if (isComp[div] == false) {
				for (int table = div * div; table <= n; table = table + div) {
//					System.out.println("asdas");
					isComp[table] = true;
				}
			}
		}
		for (int num = 2; num <= n; num++) {
			if (isComp[num] == false) {
				System.out.println(num);
			}
		}
	}
}
