package Lec_PQ_HM;

import java.util.ArrayList;
import java.util.HashMap;

public class HM_demo {
	public static void main(String[] args) {
		HashMap<String, Integer> HM = new HashMap<>();
//		HashMap<Key,Value>
		HM.put("A", 10); // O(1)
		HM.put("B12", 15);
		HM.put("dvC", -1);
		HM.put("1D", 25);
		System.out.println(HM);

		System.out.println(HM.get("B12")); // O(1)
		HM.put("??", null);
		System.out.println(HM);
		System.out.println(HM.get("??"));// O(1)
		System.out.println(HM.containsKey("??")); // O(1)

//		System.out.println(HM.keySet());
		ArrayList<String> AL = new ArrayList<>(HM.keySet());
		System.out.println(AL);
		for (String key : HM.keySet()) {
			System.out.println(key + "-" + HM.get(key));
		}
		HM.remove("B12");
		System.out.println(HM);
		HM.put("A", 99);
		System.out.println(HM);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int idx = 0; idx < nums.length; idx++) {
			if (HM.containsKey(target - nums[idx])) {
				int idx2 = HM.get(target - nums[idx]);
				ans[0] = idx;
				ans[1] = idx2;
				break;
			}
			HM.put(nums[idx], idx);
		}
		return ans;
	}
}
