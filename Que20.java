import java.util.Scanner;

public class Que20 {
    // Maximum Product Subarray
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

        int maxProduct = arr[0], minProduct = arr[0], overallMax = arr[0];
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            if (current < 0) {
                // Swap max and min when encountering a negative number
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, current * maxProduct);
            minProduct = Math.min(current, current * minProduct);

            overallMax = Math.max(overallMax, maxProduct);
        }
        System.out.println("Max product : " + overallMax);
    }
}