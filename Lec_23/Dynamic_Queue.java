package Lec_23;

import Lec_22.Queue;

public class Dynamic_Queue extends Queue {
	public void add(int ali) {
		if(isFull()) {
//			grow!!
			int[] big = new int[arr.length*2];
			for(int idx = 0;idx<arr.length;idx++) {
				big[idx] = arr[(s+idx)%arr.length];
			}
			s=0;
			arr = big;
		}
		super.add(ali);
		
	}
}
