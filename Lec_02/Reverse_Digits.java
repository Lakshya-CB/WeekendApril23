package Lec_02;

public class Reverse_Digits {
	public static void main(String[] args) {
		int num = 12345;
		int ans = 0;
		while (num > 0) {
			int rem = num % 10;
			ans = ans * 10 + rem;
			num = num / 10;
			System.out.println(rem);
		}
		System.out.println(ans);
	}
}
