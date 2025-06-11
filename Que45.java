import java.util.Scanner;

public class Que45 {

    // Pascal's Triangle

    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        if (rows <= 0) {
            System.out.println("Number of rows must be greater than 0.");
            return;
        }

        int[][] paskalsTriangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            paskalsTriangle[i] = new int[i + 1];
            paskalsTriangle[i][0] = 1;
            paskalsTriangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                paskalsTriangle[i][j] = paskalsTriangle[i - 1][j - 1] + paskalsTriangle[i - 1][j];
            }
        }

        System.out.println("Pascal's Triangle : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < paskalsTriangle[i].length; j++) {
                System.out.print(paskalsTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
