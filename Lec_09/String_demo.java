package Lec_09;

public class String_demo {
	public static void main(String[] args) {
		String str = "hello baaji kaha ho ? baaji";
		System.out.println(str);
		System.out.println(str.length());
//		System.out.println(str[i]);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(peheliSpace(str));
		System.out.println("===================");
		System.out.println(str.indexOf("Baaji"));
		System.out.println(str.lastIndexOf("Baaji"));
		System.out.println(str.startsWith("hEll"));
		System.out.println(str.endsWith("aaji"));
		System.out.println("===================");
		
		System.out.println(str.substring(0,2));
		
	}
	public static int peheliSpace(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				return i;
			}
		}
		return -1;
	}
}
