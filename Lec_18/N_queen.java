package Lec_18;

public class N_queen {
	public static void main(String[] args) {
		place(0, 0, 2, "", 2, 2);
	}

	public static void place(int r, int c, int QTP, String path,
			int tot_R, int tot_C) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}
		if (c == tot_C) {
			c = 0;
			r++;
		}
		if (r == tot_R) {// -ve BC
//			System.out.println(path);
			return;
		}
		place(r, c + 1, QTP - 1, path + "{" + r + "," + c + "}", tot_R, tot_C); // include
		place(r, c + 1, QTP, path, tot_R, tot_C);

	}
}
