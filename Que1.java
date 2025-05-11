import java.util.Scanner;

public class Que1 {

    // Find the maximum and minimum element in an array

    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.print("maximum element : " + max + "\nminimum element : " + min);
    }
}