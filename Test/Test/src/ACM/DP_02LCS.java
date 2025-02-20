package ACM;

/*
 * 给定亮哥字符串,求出这两个字符串中最长的公共子序列的长度。
 * */
public class DP_02LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 4;
		String s = "abcd";
		String t = "becd";
		solve(s, t);

	}

	private static void solve(String s, String t) {
		// TODO Auto-generated method stub
		char[] chs = new char[s.length()];
		char[] cht = new char[t.length()];
		s.getChars(0, s.length(), chs, 0);
		t.getChars(0, t.length(), cht, 0);
		int[][] dp = new int[chs.length + 1][cht.length + 1];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < cht.length; j++) {
				if (chs[i] == cht[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = max(dp[i][j + 1], dp[i + 1][j]);

				}

			}

		}
		System.out.println(dp[s.length()][t.length()]);
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i > j ? i : j;
	}

}
