package Lec_13;

public class Rec_01 {
	public static void main(String[] args) {
//		PD(5);
//		PI(5);
//		PDI(4 );
		PID(1,4);
	}
	public static void PID(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
	}
	public static void PDI(int n ) {
		if(n==0) {
			return;
		}
//		BP : PDI (n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}
	public static void PI(int n) {
		if(n==0) {
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n-1);
		System.out.println(n);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
//	BP : PD(n)
//	SP : PD(n-1)
		System.out.println(n);
		PD(n-1);
	}
}
