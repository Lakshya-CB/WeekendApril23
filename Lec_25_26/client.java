package Lec_25_26;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		System.out.println(LL.head);
		for (int i = 1; i <= 9; i++) {
			LL.addLast(i);
		}
		LL.disp();
		LL.kReverse(3);

		LL.disp();
	}
}
