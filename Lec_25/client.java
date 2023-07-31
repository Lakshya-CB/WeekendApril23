package Lec_25;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		System.out.println(LL.head);
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.disp();
		LL.reverse();
		LL.disp();
		
	}
}
