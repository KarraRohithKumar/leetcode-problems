
public class CountNegativesInMatrix {
    public static int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Start from the bottom-left corner of the matrix
        int row = rows - 1;
        int col = 0;
        
        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                // All elements to the right of this are negative
                count += (cols - col);
                row--; // Move up
            } else {
                col++; // Move right
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            { 4, 3, 2, -1 },
            { 3, 2, 1, -1 },
            { 1, 1, -1, -2 },
            { -1, -1, -2, -3 }
        };
        System.out.println("Number of negative numbers: " + countNegatives(grid)); // Output: 8
    }
}
