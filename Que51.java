// Row with Maximum Number of 1s

import java.util.Scanner;

public class Que51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter binary matrix (sorted rows):");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        sc.close();

        int maxRowIndex = -1;
        int j = cols - 1; // Start from top-right
        for (int i = 0; i < rows; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }

        if (maxRowIndex != -1) {
            System.out.println("Row with max 1s: " + maxRowIndex);
        } else {
            System.out.println("No 1s found in the matrix.");
        }
    }
}