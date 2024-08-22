import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the size of matrix: ");
        int size = sca.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sca.nextInt();

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

        int[][] rotateMatrix = rotateMatrix(matrix, size);

        for (int i = 0; i < rotateMatrix.length; i++) {
            for (int j = 0; j < rotateMatrix.length; j++) {
                System.out.print(rotateMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
public static int[][] rotateMatrix(int[][] matrix, int n) {
        for (int row = 0; row < n / 2; row++) {
            for (int col = row; col < n - row - 1; col++) {
                // Swap the top-left and top-right cells in the current group
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][n - 1 - row];
                matrix[col][n - 1 - row] = temp;

                // Swap the top-left and bottom-right cells in the current group
                temp = matrix[row][col];
                matrix[row][col] = matrix[n - 1 - row][n - 1 - col];
                matrix[n - 1 - row][n - 1 - col] = temp;

                // Swap the top-left and bottom-left cells in the current group
                temp = matrix[row][col];
                matrix[row][col] = matrix[n - 1 - col][row];
                matrix[n - 1 - col][row] = temp;
            }
        }
        return matrix;
        
    }
    
}


//formula:
//swap1: top-left <-> top-right
//swap2: top-left <-> bottom-right
//swap3: top-left <-> bottom-left

