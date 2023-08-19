package Lec_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

import Lec_Binary_Tree.BTree.Node;

public class BST {
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

	public BST(int[] pre) {
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

	public BST(int[] lvl, boolean b) {
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

	public boolean isBST() {
		return isBST2(root).isBST;
	}

	class pairBST {
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		boolean isBST = true;
	}

	private pairBST isBST2(Node nn) {
		if (nn == null) {
			return new pairBST();
		}
		pairBST L = isBST2(nn.left);
		pairBST R = isBST2(nn.right);

		pairBST ans = new pairBST();
//		min!!
		ans.Min = Math.min(L.Min, nn.data);
//		max!!
		ans.Max = Math.max(R.Max, nn.data);
//		is BST?!
		boolean self = L.Max < nn.data && nn.data < R.Min;
		ans.isBST = L.isBST && R.isBST && self;
		return ans;
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		boolean self = Max(nn.left) < nn.data && nn.data < Min(nn.right);

		return L && R && self;
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	private int Min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		if (nn.left == null) {
			return nn.data;
		}
		return Min(nn.left);
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (ali <= nn.data) {
			nn.left = add(nn.left, ali);
		} else {
			nn.right = add(nn.right, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (ali < nn.data) {
			nn.left = remove(nn.left, ali);
		} else if (ali > nn.data) {
			nn.right = remove(nn.right, ali);
		} else {
//			if no child!!
			if (nn.left == null && nn.right == null) {
				return null;
			}
			if(nn.left != null && nn.right==null) {
				return nn.left;
			}
			if(nn.left == null && nn.right!=null) {
				return nn.right;
			}
//			case 3!!!!!!!!
			nn.data = Min(nn.right);
			nn.right = remove(nn.right, nn.data);
		}
		return nn;
	}

}
