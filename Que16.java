import java.util.Arrays;
import java.util.Scanner;

public class Que16 {
    
    // Find duplicate number in array

    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Sort the array to bring duplicates together
        Arrays.sort(arr);
        boolean found = false;

        System.out.print("Duplicate number(s) in the array : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                found = true;
            }
            // Skip all further occurrences of the same number
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
        }
        if(!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}
