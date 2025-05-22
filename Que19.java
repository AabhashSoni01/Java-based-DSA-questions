
// Merge two sorted arrays without using extra space
import java.util.Arrays;
import java.util.Scanner;

public class Que19 {

    // Function to calculate the next gap
    private static int nextGap(int gap) {
        if ((gap <= 1))
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void Merge(int[] arr1, int[] arr2, int n, int m) {
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0, j = 0;

            // Compare elements in the first array
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }

            // Compare elements between both arrays
            for (j = (gap > n ? gap - n : 0); i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            // Compare elements in the second array
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }

            gap = nextGap(gap);
        }
    }

    public static void main(String[] args) {
        System.out.print("size of array1 : ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("array1 elements : "); // enter sorted elements
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("size of array2 : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("array2 elements : "); // enter sorted elements
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        Merge(arr1, arr2, size1, size2);

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
    }
}