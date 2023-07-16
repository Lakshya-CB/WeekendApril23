package Lec_22;

public class Queue {
	int s = 0;
	int size = 0;
	int[] arr = new int[5];

	public void add(int ali) {
		int idx = (s + size) % arr.length;
		arr[idx] = ali;
		size++;
	}

	public int peek() {
		return arr[s];
	}

	public int poll() {
		int ans = arr[s];
		s = (s + 1) % arr.length;
		size--;
		return ans;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
}
