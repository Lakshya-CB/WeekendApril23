package Lec_Binary_Tree;

public class clinet_BST {
	public static void main(String[] args) {
//		int[] pre = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, -1, 70 };
		int[] lvl = {10,5,19,3,6,18,21};
		BST BT = new BST(lvl,false);
		BT.lvl2();
		System.out.println(BT.isBST());

	}
}
