package Lec_05;

public class rot_2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 47;
		
		int nod = 0;
		int baaackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		System.out.println(nod);
		rot = rot % nod;

		num = baaackup;

		int mult = (int)Math.pow(10, rot);
		int part1 = num/mult;
		int part2 = num%mult;
		
//		System.out.println(part1 + " - "+part2);
		System.out.println(part2+"" +part1);
		
		int mult2 = (int)Math.pow(10, nod-rot);
		int ans = part2*mult2 +  part1;
		System.out.println(ans);
		
		
	}
}
