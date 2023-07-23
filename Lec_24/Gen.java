package Lec_24;

public class Gen {
	public static void main(String[] args) {
//		GenParen(3, 3, "");
//		System.out.println(isPossible("a", "abbabb"));
		int[] arr = {1, 4, 6, 5, 3};
		subSet(10, 0,"", arr);

	}

	public static void GenParen(int op, int cl, String str) {
		if (op == 0 && cl == 0) {
			System.out.println(str);
			return;
		}
		if (op > cl) {
			return;
		}
		if (cl > 0) {
			GenParen(op, cl - 1, str + ")");
		}
		if (op > 0) {
			GenParen(op - 1, cl, str + "(");
		}

	}

	public static boolean isPossible(String curr, String target) {
		if (!target.startsWith(curr)) {
			return false;
		}
		if (curr.endsWith("a")) {
			if (curr.equals(target)) {
				return true;
			}
			boolean sp1 = isPossible(curr + "a", target);
			boolean sp2 = isPossible(curr + "bb", target);
			return sp1 || sp2;
		} else if (curr.endsWith("bb")) {
			if (curr.equals(target)) {
				return true;
			}
			return isPossible(curr + "a", target);
		} else {
			return false;
		}
	}

	public static void subSet(int A, int idx, String path, int[] arr) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (idx == arr.length || A < 0) {
			return;
		}
		subSet(A, idx + 1, path, arr);
		
		subSet(A - arr[idx], idx + 1, arr[idx]+" "+path, arr);
		

	}
}
