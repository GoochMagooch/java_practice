/*
- Create a 2D array (3 rows x 4 columns)
- Fill each element with "RowX-ColY" using nested for loops
- Use row and column traversal to print the grid
 */
import java.util.Arrays;
public class GridPrinter {
    
    public static void main(String[] args) {
        String[][] grid = new String[3][4];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "Row" + (i+1) + "-" + "Col" + (j+1);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
