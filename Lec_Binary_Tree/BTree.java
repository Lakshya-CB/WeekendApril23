package Lec_Binary_Tree;

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
		ans.Ht = Math.max(L.Ht, R.Ht)+1;
		ans.Dia = Math.max(Math.max(R.Dia, L.Dia), self)
		return ans;
	}
}
