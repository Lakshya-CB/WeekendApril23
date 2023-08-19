package Lec_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);

		print(nn.left);
		print(nn.right);

	}

	public BTree(int[] pre, int[] in) {
		root = createPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node createPreIn(int[] pre, int preS, int preE, int[] in, int inS, int inE) {
		if (preS > preE || inS > inE) {
			return null;
		}
		Node nn = new Node(pre[preS]);
		int f = -1;
		int L_size = 0;
		for (int idx = inS; idx <= inE; idx++) {
			if (in[idx] == nn.data) {
				f = idx;
				break;
			}
			L_size++;
		}
		nn.left = createPreIn(pre, preS + 1, preS + L_size, in, inS, f - 1);
		nn.right = createPreIn(pre, preS + L_size + 1, preE, in, f + 1, inE);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int max_Dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int Dia = L + R + 2;
		max_Dia = Math.max(Dia, max_Dia);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(Math.max(R, L), self);
	}

	class pair {
		int Ht = -1;
		int Dia = 0;
	}

	private pair Dia2(Node nn) {
		if (nn == null) {
			return new pair();
		}
		pair L = Dia2(nn.left);
		pair R = Dia2(nn.right);
		int self = L.Ht + R.Ht + 2;

		pair ans = new pair();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.Dia = Math.max(Math.max(R.Dia, L.Dia), self);
		return ans;
	}

	public BTree(int[] pre) {
		pre_idx = 0;
		root = createPre(pre);
		pre_idx = 0;
	}

	int pre_idx = 0;

	private Node createPre(int[] pre) {
		if (pre_idx >= pre.length || pre[pre_idx] == -1) {
			pre_idx++;
			return null;
		}

		Node nn = new Node(pre[pre_idx]);
		pre_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			if (curr.right != null) {
				Q.add(curr.right);
			}
		}
	}

	public void lvl2() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int lvl_size = 1;
		while (!Q.isEmpty()) {
			for (int cnt = 1; cnt <= lvl_size; cnt++) {
				Node curr = Q.poll();
				System.out.print(curr.data + " ");
				if (curr.left != null) {
					Q.add(curr.left);
				}
				if (curr.right != null) {
					Q.add(curr.right);
				}
			}
			System.out.println();
			lvl_size = Q.size();
		}
	}

	public BTree(int[] lvl, boolean b) {
		int idx = 0;
		root = new Node(lvl[0]);
		idx++;
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (idx < lvl.length && !Q.isEmpty()) {
			Node nn = Q.poll();
			if (lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}

	public boolean isBal() {
		return isBal(root);

	}

	class pairBal {
		int Ht = -1;
		boolean isBal = true;
	}

	private pairBal isBal(Node nn) {
		if (nn == null) {
			return new pairBal();
		}
		pairBal L = isBal(nn.left);
		pairBal R = isBal(nn.right);

		boolean self = Math.abs(L.Ht - R.Ht) <= 1;
		pairBal ans = new pairBal();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.isBal = L.isBal && R.isBal && self;
		return ans;
	}
}
