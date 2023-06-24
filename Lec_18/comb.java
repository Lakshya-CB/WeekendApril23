package Lec_18;

public class comb {
	public static void main(String[] args) {
//		wrtPT(2, -1, 4, "");
		wrtBox(0, 2, 3, "");
	}

	public static void wrtPT(int r, int prev, int total, String path) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int box = prev + 1; box < total; box++) {
//			2
			wrtPT(r - 1, box, total, path + "b" + box);
		}
	}

	public static void wrtBox(int curr, int r, int total, String path) {

		if (r == 0) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr == total) { // -ve BC
			return;
		}
		
		wrtBox(curr + 1, r - 1, total, path + "b" + curr);// Inc
		wrtBox(curr + 1, r, total, path);

	}
}
