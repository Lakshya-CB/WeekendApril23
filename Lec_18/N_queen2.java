package Lec_18;

public class N_queen2 {
	public static void main(String[] args) {
		int n = 4;
		place(0, 0, n, "", new boolean[n][n]);
	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("W");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

	public static void place(int r, int c, int QTP, String path, boolean[][] board) {
		if (QTP == 0) {
			System.out.println(path);
			print(board);
			System.out.println("==============");
			return;
		}
		if (c == board[0].length) {
			c = 0;
			r++;
		}
		if (r == board.length) {// -ve BC
//			System.out.println(path);
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			place(r, c + 1, QTP - 1, path + "{" + r + "," + c + "}", board); // include
			board[r][c] = false;
		}
		place(r, c + 1, QTP, path, board);
//		board[r][c] = false;

	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		int R = r;
		int C = c;
		while (R >= 0 && C >= 0) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C--;
		}
		R = r;
		C = c;
		while (R >= 0 && C < board[0].length) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C++;
		}
		return true;
	}
}
