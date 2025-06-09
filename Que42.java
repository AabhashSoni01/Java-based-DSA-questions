import java.util.Scanner;

public class Que42 {

    // Print diagonals of a square matrix

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix (n*n) : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Orignal matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Primary Diagonal :");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        System.out.println("Secondary Diagonal :");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
    }
}
