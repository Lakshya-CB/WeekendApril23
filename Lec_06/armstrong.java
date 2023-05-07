package Lec_06;

public class armstrong {
	public static void main(String[] args) {
		printAllArmstrong(1000);
	}

	public static void printAllArmstrong(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArm(int num) {
		int ans = 0;
		int nod = numOfDigits(num);
		int baaackup = num;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans + (int) Math.pow(digit, nod);
		}
		return ans==baaackup;
//		if (ans == baaackup) {
//			return true;
//		} else {
//			return false;
//		}
	}

	public static int numOfDigits(int num) {
		// num = 1234
		int ans = 0;
		while (num > 0) {
			ans++;
			num = num / 10;
		}
		return ans;
	}
}
