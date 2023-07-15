package Lec_21;

import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
//		revPrint(S);
		System.out.println(S);
		ActualRev(S);
		System.out.println(S);
	}
	public static void revPrintRec(Stack<Integer> S) {
		if(S.isEmpty()) {
			return;
		}
		int ali= S.pop();
		
		revPrintRec(S);
		S.add(ali);
		System.out.println(ali);
	}
	public static void copy(Stack<Integer> S,Stack<Integer> C) {
		if(S.isEmpty()) {
			return;
		}
		int ali= S.pop();
		copy(S, C);
		C.add(ali);
	}
	public static void ActualRev(Stack<Integer> S) {
		Stack<Integer> C = new Stack<>();
		copy(S, C);
		while(!C.isEmpty()) {
			S.add(C.pop());
		}
		
	}
	public static void revPrint(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
			EX.add(ali);
		}
		while (!EX.isEmpty()) {
			int ali = EX.pop();
			S.add(ali);
			System.out.println(ali);
		}
	}
}
