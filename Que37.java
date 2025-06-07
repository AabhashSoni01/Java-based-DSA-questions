import java.util.Scanner;

public class Que37 {
    // Rotate matrix by 90 degrees clockwise
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Orignal matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] Transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("step1: transpose ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < cols; i++) {
            int start = 0, end = rows - 1;
            while (start < end) {
                int temp = Transpose[i][start];
                Transpose[i][start] = Transpose[i][end];
                Transpose[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Rotated matrix by 90 degrees clockwise : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
