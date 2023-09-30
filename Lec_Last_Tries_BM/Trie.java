package Lec_Last_Tries_BM;

import java.util.HashMap;

public class Trie {
	class Node {
		public Node(char s) {
			ch = s;
			Children = new HashMap<>();
		}

		char ch;
		HashMap<Character, Node> Children;
		boolean isWord = false;

	}

	Node head;

	public Trie() {
		// TODO Auto-generated constructor stub
		head = new Node('*');
	}

	public void addWord(String str) {
		addWord(head, str);
	}

	private void addWord(Node nn, String str) {
		if (str.isEmpty()) {
			nn.isWord = true;
			return;
		}
		char ch = str.charAt(0);
		if (!nn.Children.containsKey(ch)) {
			nn.Children.put(ch, new Node(ch));
		}
		addWord(nn.Children.get(ch), str.substring(1));
	}

	public boolean search(String str) {
		return search(head, str);
	}

	private boolean search(Node nn, String str) {
		if (str.isEmpty()) {
			return nn.isWord;
		}
		char ch = str.charAt(0);
		if (!nn.Children.containsKey(ch)) {
			return false;
		}
		return search(null,str.substring(1));
	}

}
