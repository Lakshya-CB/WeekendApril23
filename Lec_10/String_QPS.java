package Lec_10;

public class String_QPS {
	public static void main(String[] args) {
		String str = "nittin";
//		printAllss(str);
//		System.out.println(isPalindrome("aaa"));
//		printPalinSS(str);
		str = "the sky is blue";
		ultaWordNikal(str);
		
		String str2 = "???";
		System.out.println(str.equals(str2));
	}

	public static void printAllss(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
//				System.out.println(s+" - "+e);
				String temp = str.substring(s, e);
				if (isPalindrome(temp)) {
					System.out.println(temp);
				}
			}
		}
	}

	public static boolean isPalindrome(String str) {
//		anjaajnaa
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void printPalinSS(String str) {
		for (int c = 0; c < str.length(); c++) {
			grow(str, c, c);
			grow(str, c, c + 1);

		}
	}

	public static void grow(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
//				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				break;
			}
		}
	}

	public static void ultaWordNikal(String str) {
//		the sky is blue!
		while (true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx + 1);
			System.out.println(word);
			if(idx==-1) {
				return;
			}
			str = str.substring(0, idx);
		}
	}
}
