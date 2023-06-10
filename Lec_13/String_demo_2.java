package Lec_13;

public class String_demo_2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
//		str1 = str1.intern();
		String str2 = "abc";
		
		System.out.println(str1==str2);
		
		String str3 = str2.substring(1);
	}
}
