import java.util.Scanner;

public class Que8 {

    // Kadane's Algorithm - Maximum Subarray Sum

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

        // to find the maximum sum of a subarray
        int currentMax = arr[0], maxEndsHere = arr[0];
        int start = 0, end = 0, subArrStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > (maxEndsHere + arr[i])) {
                maxEndsHere = arr[i];
                subArrStart = i; // new subarray might start
            } else {
                maxEndsHere += arr[i];
            }
            if (maxEndsHere > currentMax) {
                currentMax = maxEndsHere;
                start = subArrStart;
                end = i;
            }
        }

        System.out.print("Subarray with maximum sum : ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMaximum Subarray Sum is : " + currentMax);
    }
}
