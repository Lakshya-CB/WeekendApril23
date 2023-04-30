package Lec_05;

public class functions_demo1 {
	public static void main(String[] args) {
		nacch();
		int ans = add2(10, 5);
		System.out.println(ans);
	}

	public static void nacch() {
		System.out.println("naacho");
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public static int add2(int a, int b) {
		int ans = a+b;
		return ans;
	}
}
