package Lec_03;

public class Pat_03 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int tots_st = n;
		while (r <= n) {
			int cnt_st = 0;
			while (cnt_st < tots_st) {
				System.out.print("*");
				cnt_st++;
			}
			tots_st--;
			r++;
			System.out.println();
		}
	}
}
