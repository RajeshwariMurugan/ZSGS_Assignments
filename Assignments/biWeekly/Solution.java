package biWeekly;

import java.util.Arrays;

class Solution {

	static int arr[][];
	static int n;
	static int dp[][][];

	static int helper(int r, int c, int x, int y) {
		if (r >= n || c >= n || x >= n || y >= n || arr[r][c] == -1 || arr[x][y] == -1)
			return Integer.MIN_VALUE;
		if (r == n - 1 && c == n - 1)
			return arr[r][c];

		if (dp[r][c][x] != -1)
			return dp[r][c][x];

		int ans = Integer.MIN_VALUE;

		ans = Math.max(ans, helper(r, c + 1, x, y + 1));
		ans = Math.max(ans, helper(r + 1, c, x, y + 1));
		ans = Math.max(ans, helper(r, c + 1, x + 1, y));
		ans = Math.max(ans, helper(r + 1, c, x + 1, y));

		if (arr[x][y] == 1)
			ans++;
		if (arr[r][c] == 1)
			ans++;
		if (x == r && y == c && arr[r][c] == 1)
			ans--;

		return dp[r][c][x] = ans;

	}

	public int cherryPickup(int[][] grid) {
		arr = grid;
		n = arr.length;
		dp = new int[3][3][3];

		for (var a : dp)
			for (var b : a)
				Arrays.fill(b, -1);
		return Math.max(0, helper(0, 0, 0, 0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 1, -1 }, { 1, 0, -1 }, { 1, 1, 1 } };

		// int arr[][] = { { 1, 1, -1 }, { 1, -1, 1 }, { -1, 1, 1 } };
		Solution sol = new Solution();
		System.out.println(sol.cherryPickup(arr));

	}

}