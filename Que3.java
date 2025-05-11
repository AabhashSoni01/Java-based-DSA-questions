import java.util.Arrays;
import java.util.Scanner;

public class Que3 {

    // Find the 'Kth' max and min element of an array

    static String getOrdinalSuffix(int k) {
        if (k % 100 >= 11 && k % 100 <= 13)
            return "th";
        switch (k % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for Kth max and min element
        System.out.print("the value of k : ");
        int k = sc.nextInt();
        sc.close();

        if (k <= 0 || k > size) {
            System.out.println("Invalid value of k.");
            return;
        }

        // sorts the array
        Arrays.sort(arr);

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println(k + getOrdinalSuffix(k) + " minimum element: " + kthMin);
        System.out.println(k + getOrdinalSuffix(k) + " maximum element: " + kthMax);

    }
}