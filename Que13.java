import java.util.Scanner;

public class Que13 {
    // Find all pairs with a given sum
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
        int target = sc.nextInt();
        sc.close();

        boolean found = false;
        System.out.println("all pairs for the given sum " + target + " : ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair is present for given sum " + target);
        }
        System.out.println();
    }
}
