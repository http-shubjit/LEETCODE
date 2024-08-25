// public class UniquePaths {
    
//     public static void main(String[] args) {
//         int m = 7;
//         int n = 3;
//         int[][] grid = new int[m][n];
//         int res = uniquepath(grid, m, n);
//         System.out.println(res);

//     }
    
//      static int uniquepath(int[][] grid,int m,int n){
//         for (int i = 0; i < m; i++) {
//             grid[i][0] = 1;
//         }
//         for (int i = 0; i <n ; i++) {
//             grid[0][i] = 1;
//         }
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
//             }
//         }
//         return grid[m - 1][n - 1];
//     }
// }

import java.util.Scanner;

/**
 * UniquePaths
 */
public class UniquePaths {

    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        int res = findUniquePath(m, n);
        System.out.println(res);
    }

    static int findUniquePath(int m, int n) {
        if(m==1 || n==1)
            return 1;

        return findUniquePath(m - 1, n) + findUniquePath(m, n - 1);
    }
}