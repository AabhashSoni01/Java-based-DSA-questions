import java.util.Scanner;

public class Que10 {
    // Leaders in an array
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

        // Temporary array to hold leaders (maximum possible size = size of input array)
        int[] leaders = new int[size];
        int count = 0;

        int max_from_right = arr[size - 1];
        leaders[count++] = max_from_right; // last element is always a leader

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= max_from_right) {
                leaders[count++] = arr[i];
                max_from_right = arr[i];
            }
        }

        // Print leaders in correct order (since we stored them in reverse)
        System.out.println("Leaders in the array: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}
