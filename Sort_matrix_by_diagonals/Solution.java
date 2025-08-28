

               // Sort matrix by diagonals - 3446 poblem no.


package Sort_matrix_by_diagonals;
import java.util.Arrays;
public class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int row = 0; row < rows; row++) {
            sortDiagonal(grid, row, 0, false); // false for non-increasing
        }

        for (int col = 1; col < cols; col++) {
            sortDiagonal(grid, 0, col, true); // true for non-decreasing
        }

        return grid;
    }

    private void sortDiagonal(int[][] grid, int row, int col, boolean increasing) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int len = Math.min(rows - row, cols - col);
        int[] diagonal = new int[len];

        for (int i = 0; i < len; i++) {
            diagonal[i] = grid[row + i][col + i];
        }

        Arrays.sort(diagonal);

        if (!increasing) {
            reverse(diagonal);
        }

        for (int i = 0; i < len; i++) {
            grid[row + i][col + i] = diagonal[i];
        }
    }
    private void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
