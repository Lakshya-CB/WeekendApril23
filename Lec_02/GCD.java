package Lec_02;

public class GCD {
	public static void main(String[] args) {
		int n1 = 14;
		int n2 = 38;
		int divisor = n1;
		int dividend = n2;
		while (divisor > 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
