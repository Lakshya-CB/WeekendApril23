package Lec_13;

public class dhooka {
	public static void main(String[] args) {
	   	 int n = 100_000;
	   	 long start = System.currentTimeMillis();
	   	 StringBuilder sb = new StringBuilder();
	   	 String str = "";
//	   	 int ans = 0;
	   	 int sum = 0;
	   	 for (int i = 0; i < n; i++) {
//	   		 str = str + i;// O(n)
//	   		 ans = ans +i; //O(1)
	   		sb.append(i);
	   	 }
	   	 str = sb.toString();
	   	 
	   	 long end = System.currentTimeMillis();

	   	 System.out.println((end - start) / 1000.0);
	    }

}
