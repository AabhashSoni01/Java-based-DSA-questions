import java.util.Scanner;

public class Que14 {
    // Subarray with given sum (Two pointer / Sliding window)
    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("target sum : ");
        int targetSum = sc.nextInt();
        sc.close();

        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == targetSum) {
                System.out.print("Subarray with given sum : ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
