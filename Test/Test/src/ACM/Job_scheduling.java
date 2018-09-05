package ACM;
/*
 * 有n项工作，每项工作在si 时间开始，在ti时间结束。对于每项工作，你都可以选择参加与否。如果选择了参与，那么自始至终都必须参与
 * 此外，参与工作时间不能重叠（开始的瞬间和结束的瞬间也是不允许的）。你的目标是尽可能多的工作，那么最多能参与多少项工作呢？
 * 
 * 解题思路：在可选的工作中，每次都选取结束时间最早的工作。
 * */
public class Job_scheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] schedule = { { 2, 5 }, { 1, 3 }, { 4, 7 },
				{ 6, 9 }, { 8, 10 } };
		sort(schedule);
		resolve(schedule);

	}

	private static void resolve(int[][] schedule) {
		// TODO Auto-generated method stub
		int count = 0;
		int prev = -1;
		for(int i=0;i<schedule.length;i++) {
			if(schedule[i][0]>prev) {
				count++;
				prev=schedule[i][1];
			}
			
		}
		System.out.println("count" + count);

	}

	private static void sort(int[][] key) {
		int left = 0;
		int right = key.length - 1;
		quicklySort(left, right, key);
		test(key);

	}

	private static void test(int[][] key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < key.length; i++) {

			System.out.print(
					key[i][0] + "," + key[i][1] + " ");
		}

	}

	private static void quicklySort(int left, int right,
			int[][] key) {
		if (left >= right) {
			return;
		} // 递归退出条件
		int pos = part(key, left, right);
		quicklySort(left, pos - 1, key);
		quicklySort(pos + 1, right, key);

		// TODO Auto-generated method stub

	}

	private static int part(int[][] key, int left,
			int right) {
		int tem = left;
		while (left < right) {
			while ((left < right)
					&& (key[right][1] >= key[tem][1])) {
				right--;
			}
			while ((left < right)
					&& (key[left][1] <= key[tem][1])) {
				left++;
			}
			wrap(key, left, right);

		}
		wrap(key, tem, left);
		// TODO Auto-generated method stub
		return left;
	}

	private static void wrap(int[][] key, int tem,
			int right) {
		// TODO Auto-generated method stub
		int[] temp = key[tem];
		key[tem] = key[right];
		key[right] = temp;

	}

}
