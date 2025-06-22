public class Que49 {

    // Maximum size rectangle of all 1s in binary matrix

    public static int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;

        int[][] width = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 1) {
                    width[i][j] = (j == 0) ? 1 : width[i][j - 1] + 1;

                    int minWidth = width[i][j];

                    // Go upward row by row to find max rectangle ending at (i, j)
                    for (int k = i; k >= 0 && matrix[k][j] == 1; k--) {
                        minWidth = Math.min(minWidth, width[k][j]);
                        int height = i - k + 1;
                        maxArea = Math.max(maxArea, minWidth * height);
                    }
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 1, 0, 0 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 0, 0, 1, 0 }
        };

        System.out.println("Maximum rectangle area: " + maximalRectangle(matrix));
    }
}
