package Lec_18;

import java.util.Arrays;

public class Perm {
	public static void main(String[] args) {
		int n = 3;
		int r = 2;
		boolean[] isPicked = new boolean[n];
		place(r, n, "", isPicked);
	}

	public static void place(int r, int n, String path, boolean[] ispicked) {
		if (r == 0) {
			System.out.println(path);
			System.out.println(Arrays.toString(ispicked));
			System.out.println("======");
			return;
		}
		for (int box = 0; box < n; box++) {
			if (ispicked[box] == false) {
//			pick up box!!
				ispicked[box] = true;
				place(r - 1, n, path + "b" + box, ispicked);
				ispicked[box] = false;
			}
		}
	}
}
