package Lec_24;

import java.util.Scanner;

public class rat_in_a_maze {
	static boolean anser_aaya = false;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		int C = scn.nextInt();
		char[][] board = new char[R][C];
		for (int r = 0; r < R; r++) {
			board[r] = scn.next().toCharArray();
		}
		
		chal(0, 0, board);
		if(!anser_aaya) {
			System.out.println(-1);
		}
	}
	public static void print(char[][] board) {
		for(char[] row: board) {
			for(char ch : row) {
				if(ch=='X'||ch=='O') {
					ch ='0';
				}
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
	public static void chal(int r, int c, char[][] board) {
		if(anser_aaya||r==board.length ||c==board[0].length||board[r][c]=='X') {
			return;
		}

		board[r][c] = '1';
		if(r==board.length-1 && c== board[0].length-1) {
			print(board);
			anser_aaya = true;
			return;
		}
		chal(r, c+1, board);
		chal(r+1, c, board);

		board[r][c] = 'O';
	}
}
