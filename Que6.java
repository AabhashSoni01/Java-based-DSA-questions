import java.util.Scanner;

public class Que6 {
    // Find Union and Intersection of two arrays
    public static void main(String[] args) {
        System.out.print("size of array1 and array2 : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("elements of array1 :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[size];
        System.out.println("elements of array2 :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        // union of two arrays
        int[] union = new int[arr1.length + arr2.length];
        int unionCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            union[unionCount++] = arr1[i];
        }
        // For each element in arr2, check if it is already in union[]
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unionCount; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[unionCount++] = arr2[i];
            }
        }
        System.out.print("union of array: ");
        for (int i = 0; i < unionCount; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
