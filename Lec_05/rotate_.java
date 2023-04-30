package Lec_05;

public class rotate_ {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 47;

		int nod = 0;
		int baaackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		System.out.println(nod);
		rot = rot % nod;

		num = baaackup;

		for (int r = 1; r <= rot; r++) {
			int digit = num % 10;
			int rem = num / 10;

			System.out.println(rem + " - " + digit);
			int mult = (int) Math.pow(10, 4);
			num = digit * mult + rem;
			System.out.println(digit * mult + rem);
		}

	}
}
