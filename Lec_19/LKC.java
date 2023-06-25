package Lec_19;

public class LKC {
	public static void main(String[] args) {
		LKC("245", "");

	}

	public static void LKC(String buttons, String path) {
		if (buttons.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch = buttons.charAt(0);
		String remain = buttons.substring(1);
		String ops = Options(ch);
		for (int i = 0; i < ops.length(); i++) {
			LKC(remain, path + ops.charAt(i));
		}

	}

	public static String Options(char ch) {
		String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[ch - '0'];
	}
}
