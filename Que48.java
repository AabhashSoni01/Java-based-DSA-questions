import java.util.*;

public class Que48 {
    // Find median in a row-wise sorted matrix

    private static int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low; // 'low' is the number of elements <= target
    }

    public static int median(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            min = Math.min(min, row[0]);
            max = Math.max(max, row[c - 1]);
        }

        int target = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int p = 0;
            for (int[] row : matrix) {
                p += countLessEqual(row, mid);
            }

            if (p < target) {
                mid = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
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
        System.out.println("Matrix input complete.");

        sc.close();
        System.out.println("Median: " + median(matrix));
    }
}
