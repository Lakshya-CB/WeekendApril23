package Lec_17;

public class maze_path {
	public static void main(String[] args) {
		suvle(0, 0, "", 2, 2);
	}

	public static void suvle(int r, int c, String path,

			int dest_r, int dest_c) {
		if(r>dest_r||c>dest_c) {
			return;
		}
		if(r==dest_r && c==dest_c) {
			System.out.println(path);
			return;
		}
		suvle(r+1, c, path+"D", dest_r, dest_c);
		suvle(r, c+1, path+"R", dest_r, dest_c);
	}
}
