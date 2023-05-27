package Lec_10;

public class String_demo {
	public static void main(String[] args) {
		char[] arr = {'h','e','l','l'};
		System.out.println(arr);
		
		
		String str = "hello";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		
		str = "cats and dogs";
//		System.out.println(str.indexOf("aNd"));
		System.out.println(str.lastIndexOf("and"));
		
		System.out.println(str.startsWith("Ca")); //prefix
		System.out.println(str.endsWith("pppp"));
		
		System.out.println("===================");
		System.out.println(str.substring(0,4));
	}
	
}
