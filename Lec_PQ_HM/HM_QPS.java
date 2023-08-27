package Lec_PQ_HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HM_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
////		Intersection(arr1, arr2);
//		MinConToMakeSubSeq("catsanddogs", "caaoddoddc");

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		LongestConsChain(arr);
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
//			int prev_freq = 0;
//			if(HM.containsKey(ali)) {
//				prev_freq  = HM.get(ali);
//			}
			int prev_freq = HM.getOrDefault(ali, 0);
			HM.put(ali, prev_freq + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				System.out.println(ali);
				int prev_freq = HM.get(ali);
				HM.put(ali, prev_freq - 1);
			}
		}
	}

	public static int MinConToMakeSubSeq(String s, String t) {
		HashMap<Character, ArrayList<Integer>> HM = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
//			HM.put(s.charAt(i),new ArrayList<>());
			ArrayList<Integer> IDX = HM.getOrDefault(s.charAt(i), new ArrayList<>());
			IDX.add(i);
			HM.put(s.charAt(i), IDX);

		}
		System.out.println(HM);
		int prev_idx = -1;
		int ans = 1;
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (!HM.containsKey(ch)) {
				return -1;
			}
			ArrayList<Integer> IDX = HM.get(ch);
			if (IDX.get(IDX.size() - 1) < prev_idx) {
				ans++;
				prev_idx = IDX.get(0);
			} else {
//				binary search to get the first True
//				F F F F T T T T T
				prev_idx = FirstOfT(IDX, prev_idx);
			}
			System.out.println("============================");

			System.out.println(ch + " - " + prev_idx + " " + IDX);
//			System.out.println("naacho" + IDX + prev_idx);

		}

		return 0;
	}

	public static int FirstOfT(ArrayList<Integer> AL, int ali) {
		int ans = -1;
		int s = 0;
		int e = AL.size() - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (AL.get(mid) <= ali) {
				s = mid + 1;
			} else {
				ans = mid;
				e = mid - 1;
			}
		}
		return AL.get(ans);
	}

	public static void LongestConsChain(int[] arr) {
		HashSet<Integer> Set = new HashSet<>();
		for (int ali : arr) {
			Set.add(ali);
		}
		for (int ali : arr) {
			if (!Set.contains(ali - 1)) {
				int temp = ali;
				while (Set.contains(temp)) {
					System.out.print(temp + " => ");
					temp++;
				}
				System.out.println();
			}

		}
	}
}
