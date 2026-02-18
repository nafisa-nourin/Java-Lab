//10-2-26 matrix pathfinder

class MazeSolver {

    static boolean findPath(int[][] grid, int row, int col) {

        int n = grid.length;

        // Out of bounds or blocked cell
        if (row >= n || col >= n || grid[row][col] == 0) {
            return false;
        }

        // Destination reached
        if (row == n - 1 && col == n - 1) {
            return true;
        }

        // Mark cell as visited
        grid[row][col] = 0;

        // Move right or down
        return findPath(grid, row, col + 1) ||
               findPath(grid, row + 1, col);
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 1},
            {0, 1, 0},
            {1, 1, 1}
        };

        if (findPath(grid, 0, 0))
            System.out.println("Path Exists");
        else
            System.out.println("Path Does Not Exist");
    }
}

