package ACM;
/*
 * ��n�����ÿ�����si ʱ�俪ʼ����tiʱ�����������ÿ������㶼����ѡ��μ�������ѡ���˲��룬��ô��ʼ���ն��������
 * ���⣬���빤��ʱ�䲻���ص�����ʼ��˲��ͽ�����˲��Ҳ�ǲ�����ģ������Ŀ���Ǿ����ܶ�Ĺ�������ô����ܲ����������أ�
 * 
 * ����˼·���ڿ�ѡ�Ĺ����У�ÿ�ζ�ѡȡ����ʱ������Ĺ�����
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
		} // �ݹ��˳�����
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
