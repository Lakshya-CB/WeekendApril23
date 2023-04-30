package Lec_04;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int total_st = n;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < total_st) {
//				if () {
					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
				cnt_st++;
			}

			row++;
			System.out.println();
		}
	}
}
