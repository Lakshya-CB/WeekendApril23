package Lec_04;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 7;
		int r = 1;
		int total_st = 1;
		int total_sp = 2 * n - 1 - 2;
		while (r <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}

			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st2 = 0;
			if (r == n) {
				cnt_st2 = 1; 
//				total_st--;
			}
			while (cnt_st2 < total_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			System.out.println();
			r++;
			total_st++;
			total_sp = total_sp - 2;
		}
	}
}
