package Lec_03;

public class Pat_05 {
	public static void main(String[] args) {
		int n = 5;

		int r = 1;
		int tot_sp = 0;
		int tot_st = 1;
		while (r <= n) {
			int cnt_sp = 0;
			while (cnt_sp < tot_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < tot_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			r++;
			tot_sp = tot_sp + 2;
			tot_st--;
		}
	}
}
