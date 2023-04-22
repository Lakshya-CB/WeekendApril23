package Lec_02;

public class Fibo {
	public static void main(String[] args) {
		int n = 5;
		int a = 0;
		int b = 1;
		int cnt = 0;
		int c = 999;
		while (cnt < n) {
			c = a + b;
			a = b;
			b = c;

			cnt++;
		}
		System.out.println(b);

	}
}
