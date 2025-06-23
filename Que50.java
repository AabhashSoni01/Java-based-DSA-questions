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

        boolean zeroInFirstRow = false, zeroInFirstCol = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                zeroInFirstCol = true;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                zeroInFirstRow = true;
            }
        }
    }

}
