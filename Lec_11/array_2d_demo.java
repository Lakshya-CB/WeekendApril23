package Lec_11;

public class array_2d_demo {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		System.out.println(arr.length);//100k.length
		
		arr[0] = null;
		
		arr[1] = new int[999999];
		for(int[] row:arr) {
			System.out.println(row);
		}
		
//		
//		int cnt=1;
//		for(int r = 0;r<arr.length;r++) {
////			System.out.println(arr[r]);
//			for(int c =0;c<arr[r].length;c++) {
////				System.out.println(arr[r][c]);
//				arr[r][c] = cnt;
//				cnt++;
//			}
//		}
//		
//		for(int r = 0;r<arr.length;r++) {
//			for(int c =0;c<arr[r].length;c++) {
//				System.out.print(arr[r][c]+" ");
//				
//			}
//			System.out.println();
//		}
	}
}
