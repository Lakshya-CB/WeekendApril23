package Lec_04;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long l = 0;
		long mult = 1;

		long ans = 0;
		while (l > 0) {
			int digit = (int) (l % 10);
			if(digit==0) {
				digit = 5;
			}
//			System.out.println(digit);
			ans = ans + digit * mult;
			l = l / 10;
			mult = mult * 10;
		}
		if(ans==0) {
			ans = 5;
		}
		System.out.println(ans);
//		System.out.println(l+"zxczx");
	}
}
