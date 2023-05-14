package Lec_09;

import java.util.Scanner;

public class String_demo_2 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
//		String str = "nittin";
//		palinSS(str);
//		System.out.println(isPalin(str));
//		String str = "the sky is blue";
		String str = scn.next(); // word
//		String str = scn.nextLine(); // word
		
//		extractWordsRev(str);
		System.out.println(str + "===--==");
	}

	public static void extractWordsRev(String str) {
		while (true) {
			int f = str.lastIndexOf(" ");
			String word = str.substring(f + 1);
			System.out.println(word);
			if (f == -1) {
				return;
			}
			str = str.substring(0, f);
		}
	}

	public static boolean isAnagram(String s, String t) {
		int[] batua = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			batua[ch - 'a'] = batua[ch - 'a'] + 1;

		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			batua[ch - 'a'] = batua[ch - 'a'] - 1;
		}
		for (int freq : batua) {
			if (freq != 0) {
				return false;
			}
		}
		return true;
	}

	public static void printSS(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static boolean isPalin(String str) {
		int startindex = 0;
		int endindex = str.length() - 1;
		while (startindex < endindex) {
			if (str.charAt(startindex) != str.charAt(endindex)) {
				return false;
			}
			startindex++;
			endindex--;
		}
		return true;
	}

	public static void palinSS(String str) {
		for (int c = 0; c < str.length(); c++) {
			grow(str, c, c); // Odd
			grow(str, c, c + 1); // Even!!

		}
	}

	public static void grow(String str, int L, int R) {
//		str = "nitin" ; L R=2 
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
//				L to R is palindrome!
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				break;
			}
		}
	}
}
