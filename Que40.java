import java.util.Scanner;

public class Que40 {

    // Matrix multiplication

    public static void main(String[] args) {
        System.out.print("For matrix1: Enter the number of rows : ");
        Scanner sc1 = new Scanner(System.in);
        int rows1 = sc1.nextInt();
        System.out.print("For matrix1: Enter the number of columns : ");
        int cols1 = sc1.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("For matrix1: Enter elements of the matrix : ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc1.nextInt();
            }
        }

        System.out.print("For matrix2: Enter the number of rows : ");
        Scanner sc2 = new Scanner(System.in);
        int rows2 = sc2.nextInt();
        System.out.print("For matrix2:: Enter the number of columns : ");
        int cols2 = sc2.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("For matrix2: Enter elements of the matrix : ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc2.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Matrix1 * Matrix2 : ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc1.close();
        sc2.close();
    }
}
