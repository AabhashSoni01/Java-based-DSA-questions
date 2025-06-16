import java.util.Scanner;

public class Que38 {

    // Search in a row-wise and column-wise sorted matrix

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

        System.out.print("Enter the element : ");
        int element = sc.nextInt();

        int r = 0, c = cols - 1; // r for row, c for coloumn
        boolean found = false;
        while (r < rows && c >= 0) {
            if (matrix[r][c] == element) {
                System.out.println("Element " + element + " found at [" + (r + 1) + ", " + (c + 1) + "]");
                found = true;
                break;
            } else if (matrix[r][c] > element) {
                c--;
            } else {
                r++;
            }
        }

        if (!found) {
            System.out.println("Element not found in the matrix !!");
        }
        sc.close();
    }
}
