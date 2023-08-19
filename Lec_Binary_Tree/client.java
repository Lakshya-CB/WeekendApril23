package Lec_Binary_Tree;

public class client {
	public static void main(String[] args) {
////		int[] pre = { 10, 20, 40, 50, 30, 60 };
////		int[] in = { 40, 20, 50, 10, 30, 60 };
////		BTree BT = new BTree(pre, in);
//		BT.print();
		int[] pre = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, -1, 70 };
		BTree BT = new BTree(pre);
		BT.lvl2();

	}
}
