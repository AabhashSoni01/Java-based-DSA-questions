import java.util.Scanner;

public class Que2 {

    // Reverse an array in place

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Reverse in place using two-pointer technique
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // prints reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
