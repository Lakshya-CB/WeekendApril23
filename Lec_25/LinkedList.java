package Lec_25;

public class LinkedList {
	class Node {
		public Node(int ali) {
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int s = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.print(temp.data+ "=>");
			temp = temp.next;
			s++;
		}
//		System.out.println();
		return s;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("ky deekh rha hein ?");
		}

		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("ky deekh rha hein ?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("ky deekh rha hein ?");

		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("ky deekh rha hein ?");

		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
			return;
		}
		if (idx == size()) {
			addLast(ali);
			return;
		}
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("kaha daal rha?!");
		}

		Node curr = new Node(ali);
		Node prev = getNodeAt(idx - 1);
		Node after = prev.next;
		prev.next = curr;
		curr.next = after;
	}

	public int removeFirst() {

		if (isEmpty()) {
			throw new RuntimeException("Kya nikal raha hein ?");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeLast() {
		if (size() <= 1) {
			return removeFirst();
		}
		Node second_Last = getNodeAt(size() - 2);
		Node last = second_Last.next;
		second_Last.next = null;
		return last.data;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		}
		if (idx == size() - 1) {
			return removeLast();
		}
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Kya nikal raha hein ?");
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = prev.next.next;// curr.next;
		prev.next = after;
		return curr.data;
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;

			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void reverse2() {
		reverse2(head);
	}

	   

}
