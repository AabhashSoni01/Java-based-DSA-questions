import java.util.Scanner;

public class Que50 {

    // Boolean Matrix problem (set row/column to 1 if any element is 1)

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
        sc.close();

        System.out.println("Orignal matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean oneInFirstRow = false, oneInFirstCol = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 1) {
                oneInFirstCol = true;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 1) {
                oneInFirstRow = true;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        if (oneInFirstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 1;
            }
        }

        if (oneInFirstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 1;
            }
        }

        System.out.println("New matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
