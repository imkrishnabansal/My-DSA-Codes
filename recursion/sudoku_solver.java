package recursion;

public class sudoku_solver {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (sudoku(grid, 0, 0)) {
            display(grid);
        } else {
            System.out.println("No solution exists");
        }
    }

    public static boolean sudoku(int[][] grid, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (grid[row][col] != 0) {
            return sudoku(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (IsitSafe(grid, row, col, val)) {
                    grid[row][col] = val;
                    if (sudoku(grid, row, col + 1)) {
                        return true;
                    }
                    grid[row][col] = 0; // backtrack
                }
            }
            return false;
        }
    }

    public static boolean IsitSafe(int[][] grid, int row, int col, int val) {
        // Check the column
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == val) {
                return false;
            }
        }
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val) {
                return false;
            }
        }
        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}