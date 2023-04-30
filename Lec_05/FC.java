package Lec_05;

public class FC {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;
		for (int F = minF; F <= maxF; F = F + step) {
//			int C =(int) ((5.0 / 9) * (F - 32));
			int C = 5 * (F - 32) / 9;

			System.out.println(F + " => " + C);
		}
	}
}
