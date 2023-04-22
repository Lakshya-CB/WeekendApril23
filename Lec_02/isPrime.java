package Lec_02;

public class isPrime {
	public static void main(String[] args) {
		int n = 32176085;
		int divisor = 1;
		int numOfFac = 0;
		while (divisor <= n) {
			int rem = n % divisor;
//			System.out.println(divisor + " - " + rem);
			if(rem==0) {
				System.out.println(divisor);
				numOfFac=numOfFac+1;
			}

			divisor = divisor + 1;
		}
		System.out.println(numOfFac); 
		if(numOfFac==2) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
	}
}
