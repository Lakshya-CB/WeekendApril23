package Lec_19;

public class blocked_maze {
	public static void main(String[] args) {
		int[][] maze = { 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 1, 0 } };
		solve(0, 0,"" , maze, new boolean[maze.length][maze[0].length]);
	}

	public static void solve(int r, int c, String path, int[][] Maze, boolean[][] Visited) {
		if(r==Maze.length-1 && c== Maze[0].length-1) {
			System.out.println(path);
			return;
		}
		if (r < 0 || c < 0 || r == Maze.length || c == Maze[0].length 
				|| Maze[r][c] == 1||Visited[r][c]) {
			return;
		}
		Visited[r][c] = true; 
		solve(r - 1, c, path + "U", Maze,Visited);
		solve(r + 1, c, path + "D", Maze,Visited);
		solve(r, c - 1, path + "L", Maze,Visited);
		solve(r, c + 1, path + "R", Maze,Visited);
		Visited[r][c] = false;
	}
	
}
