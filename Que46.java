import java.util.Scanner;

public class Que46 {

    // Search a 2D matrix (Leetcode 74)

    public static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / cols, col = mid % cols;
            int midElement = matrix[row][col];

            if (midElement == target)
                return new int[] { row, col };
            else if (midElement < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

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

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        sc.close();

        int[] found = searchMatrix(matrix, target);
        if (found != null) {
            System.out.println("Element " + target + " found at index : " + "( " + found[0] + ", "
                    + found[1] + " )");
        } else {
            System.out.println("Element " + target + " not found !");
        }
    }
}
