package Lec_03;

public class Pat_0 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		while (r <= n) {
			int cnt_st = 0;
			while (cnt_st < n) {
				System.out.print("*");
				cnt_st++;
			}
			System.out.println();
			r++;
		}
	}
}
