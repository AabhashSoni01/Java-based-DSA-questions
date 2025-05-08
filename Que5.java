import java.util.Arrays;
import java.util.Scanner;

public class Que5 {

    // Move all negative numbers to beginning and positive to end

    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : "); // only 0s, 1s and 2s
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Temporary arrays to hold negatives and positives
        int[] negatives = new int[size];
        int[] positives = new int[size];
        int negCount = 0, posCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negatives[negCount++] = arr[i];
            } else {
                positives[posCount++] = arr[i];
            }
        }

        // Sort only the used parts of the arrays
        Arrays.sort(negatives, 0, negCount);
        Arrays.sort(positives, 0, posCount);

        // Merge sorted arrays
        int[] merged = new int[size];
        for (int i = 0; i < negCount; i++) {
            merged[i] = negatives[i];
        }

        for (int i = 0; i < posCount; i++) {
            merged[negCount + i] = positives[i];
        }

        // Print result
        System.out.print("Rearranged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}