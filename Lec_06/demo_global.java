package Lec_06;

public class demo_global {
	
	static int val = 100;
	public static void main(String[] args) {
		System.out.println(demo_global.val);
		fun(20);
	}
	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(demo_global.val);
		val = val + 60;
		demo_global.val = val + 10;
		System.out.println(val);
		System.out.println(demo_global.val);
	}

}
