package Lec_03;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 5;

		int r = 1;
		int tot_sp = n - 1;
		int tot_st = 1;
		while (r <= n) {
			int cnt_sp = 0;
			while (cnt_sp < tot_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < tot_st) {
				if (cnt_st % 2 == 0) {
					System.out.print("* ");
				} else {

					System.out.print("! ");
				}
				cnt_st++;
			}

			System.out.println();
			r++;
			tot_st = tot_st + 2;
			tot_sp--;
		}
	}
}
