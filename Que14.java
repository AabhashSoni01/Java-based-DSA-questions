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

        System.out.print("target : ");
        int target = sc.nextInt();
        sc.close();
    }
}
