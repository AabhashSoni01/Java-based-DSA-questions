import java.util.Scanner;

public class Que7 {

    // Cyclically rotate an array by one
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Cyclic Rotation by One (Right Shift)
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("cyclically rotated array by one (Right Shift) : ");
        for (int num : arr) {
            System.out.println(num);
        }

        // Cyclic Rotation by One (Left Shift)
        int ttemp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = ttemp;
        // left shift is applied after the right shift on the same array, so the array
        // returns to its original state.
        System.out.println("cyclically rotated array by one (Left Shift) : ");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}