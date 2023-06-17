package Lec_16;

public class Rec_basic {
	public static void main(String[] args) {
//		SubSeq("abc", "");
//		ClimbStairs(0, "", 4);
		GenParen(3, 3, "");
	}

	public static void SubSeq(String str, String team) {
//		BP : str = "abcd" 
//		SP : str = "bcd"
		if (str.isEmpty()) {
			System.out.println("^" + team);
			return;
		}
		String remain = str.substring(1);
		char ch = str.charAt(0);
		SubSeq(remain, team + ch); // include
		SubSeq(remain, team); // exclude!!
	}

	public static void ClimbStairs(int curr, String path, int dest) {
		if (curr == dest) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr > dest) { // -ve BC
			return;
		}

		ClimbStairs(curr + 1, path + 1, dest);
		ClimbStairs(curr + 2, path + 2, dest);

	}

	public static void GenParen(int op, int cl, String str) {
		if (op == 0 && cl == 0) {
			System.out.println(str);
			return;
		}
		if(op>cl) {
			return;
		}
		if (op > 0) {
			GenParen(op - 1, cl, str + "(");
		}
		if (cl > 0) {
			GenParen(op, cl - 1, str + ")");
		}
	}
	

}
