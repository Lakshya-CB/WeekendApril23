package Lec_13;

public class StringBuild_demo {
	public static void main(String[] args) {
		String str = "oops";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(sb.length());
		
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));
		
		System.out.println(sb.lastIndexOf("o"));
		System.out.println(sb.substring(2));
		
		System.out.println("============");
		sb.setCharAt(1, '~');//O(1)
		System.out.println(sb);
		sb.append("jaaduuu dhoop"); //O(m)
		System.out.println(sb);
		sb.insert(4, "^");
		System.out.println(sb);
		
		sb.deleteCharAt(4);
		System.out.println(sb);
	}
}
