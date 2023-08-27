package Lec_PQ_HM;

import java.util.ArrayList;
import java.util.HashMap;
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
		System.out.println(nn.data);
		print(nn.left);
		print(nn.right);
	}

	public BTree(int[] pre, int[] in) {
		// TODO Auto-generated constructor stub
		root = createPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node createPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		System.out.println(nn.data + " -- ");
		int f = -1;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			L_size++;

		}

		nn.left = createPreIn(pre, ps + 1, ps + L_size, in, is, f - 1);
		nn.right = createPreIn(pre, ps + 1 + L_size, pe, in, f + 1, ie);
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

	int global = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int self = L + R + 2;
		boolean self_isBal = Math.abs(L - R) <= 1;

		global = Math.max(global, self);
		return 1 + Math.max(L, R);
	}

	public int Dia() {
//		return Dia(root);
		return Dia2(root).Dia;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(Math.max(L, R), self);
	}

	class pair {
		int Dia = 0;
		int Ht = -1;
	}

	private pair Dia2(Node nn) {
		if (nn == null) {
			return new pair();
		}
		pair L = Dia2(nn.left);
		pair R = Dia2(nn.right);
		int self = L.Ht + R.Ht + 2;

//		###########################
		pair ans = new pair();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		ans.Dia = Math.max(Math.max(L.Dia, R.Dia), self);
		return ans;

	}

	int p_idx = 0;

	public BTree(int[] pre) {
		p_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (p_idx >= pre.length || pre[p_idx] == -1) {
			p_idx++;
			return null;
		}
		Node nn = new Node(pre[p_idx]);
		p_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public void lvlPrint() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_size = 1;
//		while(!Q.isEmpty()) {
		while (curr_size > 0) {
			for (int cnt = 1; cnt <= curr_size; cnt++) {
				Node nn = Q.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}
			}
			curr_size = Q.size();
			System.out.println();
		}
	}

	public BTree(int[] lvl, boolean b) {
		root = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int idx = 1;
		while (idx < lvl.length && !Q.isEmpty()) {

			Node nn = Q.poll();
//			System.out.println(nn.data);
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}

	public void Vertical() {
		HashMap<Integer, ArrayList<Integer>> HM = new HashMap<>();
		Vertical(root, 0, HM);
		System.out.println(HM);
	}

	private void Vertical(Node nn, int score, HashMap<Integer, ArrayList<Integer>> HM) {
		if (nn == null) {
			return;
		}
		ArrayList<Integer> AL = HM.getOrDefault(score, new ArrayList<>());
		AL.add(nn.data);
		HM.put(score, AL);
		Vertical(nn.left, score + 1, HM);
		Vertical(nn.right, score - 1, HM);

	}
}
