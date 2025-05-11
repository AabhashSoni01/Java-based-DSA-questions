import java.util.Scanner;

public class Que4 {

    // Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements (only 0s, 1s and 2s) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // input validation
            if (arr[i] < 0 || arr[i] > 2) {
                System.out.println("Invalid input! Only 0, 1, and 2 are allowed.");
                sc.close();
                return;
            }
        }
        sc.close();

        int low = 0, mid = 0, high = arr.length - 1;

        // sorting the array
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        // sorted array
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}