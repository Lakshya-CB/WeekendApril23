package Lec_Last_Tries_BM;

public class lll {
	public static void main(String[] args) {
//		int i = 10;
//		System.out.println(i ^ 0 );
//	
//		byte b = -10;
//		byte num = 40;
//		System.out.println(b);
//		System.out.println(b >>> 2);

		System.out.println(rightMostSetBit(4 +16));
	}

	public static int turnIthBit(int x, int i) {
		int mask = 1 << i;
		return mask | x;
	}

	public static int turnItnBigOff(int x, int i) {
		int mask = ~(1 << i);
		return mask & x;
	}

	public static int toggleIthBig(int x, int i) {
		int mask = 1 << i;
		return mask ^ x;
	}

	public static boolean checkIthBit(int x, int i) {
		int mask = 1 << i;
		return (x & mask) > 0;
	}

	public static int rightMostSetBit(int x) {
		return x & (-x);
	}

}
