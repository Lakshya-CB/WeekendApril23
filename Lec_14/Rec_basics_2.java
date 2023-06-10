package Lec_14;

public class Rec_basics_2 {
	public static void main(String[] args) {
//		System.out.println(Fac(4));
		System.out.println(pow(2, 3));
	}

	public static int Fac(int n) {
//	BP	: Fac(n)
//	SP	: Fac(n-1)
		if (n == 0) {
			return 1;
		}
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int sp = pow(a, b-1);
		return sp * a;
	}
}
