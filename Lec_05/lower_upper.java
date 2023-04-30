package Lec_05;

import java.util.Scanner;

public class lower_upper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
//		System.out.println(ch);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("uper");
		}else if(ch>='a' && ch<='z') {
			System.out.println("low");
		}else {
			System.out.println("nahi pata");
		}
	}
}
