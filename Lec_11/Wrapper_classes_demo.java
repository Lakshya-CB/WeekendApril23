package Lec_11;

public class Wrapper_classes_demo {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Integer I = 1000;
		System.out.println(I);
		
//		I = i; // autobxing!!// stack to heap!!
//		System.out.println(I);
//		
		i = I;// unboxing!! => heap to stack
	}
}
