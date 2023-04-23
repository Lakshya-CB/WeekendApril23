package Lec_03;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 9;
		int r = 1;
		int total_st = 1;
		while (r <= n) {
			int cnt_st = 0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			r++;
			total_st++;
			System.out.println();
		}
	}
}
