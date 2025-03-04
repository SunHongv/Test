package ACM;

/*
 * 有n个重量和价值分别为wi,vi的物品。从这些物品中挑选出总重量不超过W的物品，求所有挑选方案中价值总和的最大值。
 *
 * */
public class DP_01Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve_01();
		solve_02();

	}

	private static void solve_02() {
		int n = 4;
		int[][] wv = { { 2, 3 }, { 1, 2 }, { 3, 4 }, { 2, 2 } };
		int[] weight = { 2, 1, 3, 4 };
		int[] value = { 3, 2, 4, 2 };
		int W = 5;
		int[][] dp = new int[n + 1][W + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < W + 1; j++) {
				if (j < weight[i]) {
					dp[i + 1][j] = dp[i][j];
				} else {
					dp[i + 1][j] = max(dp[i][j], dp[i][j - weight[i]] + value[i]);

				}

			}

		}
		System.out.println(dp[n][W]);
	}

	private static void solve_01() {
		int n = 4;
		int[][] wv = { { 2, 3 }, { 1, 2 }, { 3, 4 }, { 2, 2 } };
		int[] weight = { 2, 1, 3, 4 };
		int[] value = { 3, 2, 4, 2 };
		int W = 5;
		int[][] dp = new int[n + 1][W + 1];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= W; j++) {
				if (j < weight[i]) {
					dp[i][j] = dp[i + 1][j];
				} else {

					dp[i][j] = max(dp[i + 1][j], dp[i + 1][j - weight[i]] + value[i]);
				}
			}

		}
		System.out.println(dp[0][W]);
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

}
