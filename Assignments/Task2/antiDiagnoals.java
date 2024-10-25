package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
details.
Example
Input:
1 2 3
4 5 6
7 8 9
Output : [
[1],
[2, 4],
[3, 5, 7],
[6, 8],
[9]
]
Input :
1 2
3 4
Output :
[ [1],
[2, 3],
[4]
]
 */
public class antiDiagnoals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and Column");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int matrix[][] = new int[rows][cols];
		System.out.println("Enter matrix elements");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		List<List<Integer>> result = new ArrayList<>();

		int n = matrix.length;
		for (int col = 0; col < n; col++) {
			List<Integer> diagonal = new ArrayList<>();
			int row = 0;
			int currentCol = col;

			while (row < n && currentCol >= 0) {
				diagonal.add(matrix[row][currentCol]);
				row++;
				currentCol--;
			}

			result.add(diagonal);
		}

		for (int row = 1; row < n; row++) {
			List<Integer> diagonal = new ArrayList<>();
			int currentRow = row;
			int col = n - 1;

			while (currentRow < n && col >= 0) {
				diagonal.add(matrix[currentRow][col]);
				currentRow++;
				col--;
			}

			result.add(diagonal);
		}
		
        for (List<Integer> diagonal : result) {
            System.out.println(diagonal);
        }

	}

}
