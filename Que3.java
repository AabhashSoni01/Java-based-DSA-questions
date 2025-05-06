import java.util.Scanner;

public class Que3 {

    // Find the 'Kth' max and min element of an array

    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for Kth max and min element
        int k = sc.nextInt();
        sc.close();

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.");
            return;
        }

        // sorts the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println(k + "th max element : " + kthMax + k + "th min element : " + kthMin);
    }
}