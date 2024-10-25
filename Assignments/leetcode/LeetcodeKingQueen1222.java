package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeKingQueen1222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hoo");

		int[][] queens = new int[][] { { 0, 1 }, { 1, 0 }, { 4, 0 }, { 0, 4 }, { 3, 3 }, { 2, 4 } };
		int[] king = { 0, 0 };

		boolean grid[][] = new boolean[8][8];

		for (int queen[] : queens) {
			grid[queen[0]][queen[1]] = true;
		}
		int[][] direction = new int[][] { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 0, -1 }, { -1, 0 }, { -1, -1 }, { -1, 1 },
				{ 1, -1 } };

		List list = new ArrayList<>();

		for (final int[] directions : direction) {
			int i = king[0], j = king[1];

			while (i < 8 && j < 8 && i >= 0 && j >= 0) {
				if (grid[i][j]) {
					System.out.println(i+"  "+j);
					list.add(List.of(i, j));
					break;
				}

				i += directions[0];
				j += directions[1];
			}
		}
		System.out.println(list.toString());
	}

}
