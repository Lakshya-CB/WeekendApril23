package Lec_06;

public class demo_dn_1 {
	static int worldwide =99;
	
	public static void main(String[] args) {
		System.out.println(worldwide);
		int a = 1;
		int b = 20;
//		System.out.println(a + " : " + b);
		swap(a, b);
//		System.out.println(a + " : " + b);
		System.out.println(worldwide);
	}

	public static void swap(int a, int b) {
		worldwide++;
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = a;
		System.out.println(a + " : " + b);
	}

}
