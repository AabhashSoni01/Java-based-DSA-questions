import java.util.Scanner;

public class Que11 {

    // Rearrange array in alternating positive & negative items

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Separate positive and negative elements
        int[] positive = new int[size];
        int[] negative = new int[size];
        int positiveIndex = 0, negativeIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) { // Treating 0 as positive
                positive[positiveIndex++] = arr[i];
            } else {
                negative[negativeIndex++] = arr[i];
            }
        }

        // Merge in alternating fashion
        int i = 0, p = 0, n = 0;
        while (p < positiveIndex && n < negativeIndex) {
            if (i % 2 == 0) {
                arr[i++] = positive[p++];
            } else {
                arr[i++] = negative[n++];
            }
        }

        // Append remaining positives or negatives
        while (p < positiveIndex) {
            arr[i++] = positive[p++];
        }
        while (n < negativeIndex) {
            arr[i++] = negative[n++];
        }

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
