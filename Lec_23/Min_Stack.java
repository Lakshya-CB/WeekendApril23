package Lec_23;

public class Min_Stack extends Dynamic_Stack {
	int curr_min;

	@Override
	public void add(int ali) {
		if (this.isEmpty()) {
			curr_min = ali;
			super.add(ali);
		} else if (ali >= curr_min) {
			super.add(ali);
		} else {
			int prev_min = curr_min;
			curr_min = ali;
			int magiiiiical = 2 * curr_min - prev_min;
			super.add(magiiiiical);
		}
	}

	@Override
	public int peek() {

		int ali = super.peek();
		if (ali >= curr_min) {
			return ali;
		} else {
			return curr_min;
		}
	}

	@Override
	public int pop() {

		int ali = super.pop();
		if (ali >= curr_min) {
			return ali;
		} else {
			int ans = curr_min;
			int magical = ali;
//			##############
			int prev_min = 2 * curr_min - magical;
			curr_min = prev_min;
//			###############
			return ans;
		}
	}
}
